package week12.filmReference;

import week12.filmReference.domain.Film;
import week12.filmReference.domain.Person;
import week12.filmReference.domain.Rating;

import java.util.*;
import java.util.stream.Collectors;

public class Reference {

    RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }

    private Map<Person, Integer> getPreferenceScores(Person person) {
        Map<Person, Integer> preferenceScores = new HashMap<>();
        List<Person> reviewers = register.reviewers();

        for (Person reviewer : reviewers) {
            Set<Film> reviewerFilms = register.getPersonalRatings(reviewer).keySet();
            int sum = 0;

            for (Film film : register.getPersonalRatings(person).keySet()) {
                if (reviewerFilms.contains(film)) {
                    int personRating = register.getRating(person, film).getValue();
                    int reviewerRating = register.getRating(reviewer, film).getValue();
                    sum += (personRating * reviewerRating);
                }
            }

            preferenceScores.put(reviewer, sum);
        }

        return preferenceScores;
    }

    Person getPersonwithBestScore(Map<Person, Integer> preferenceScores) {
        Person highest;
        int highestVal = Integer.MIN_VALUE;

        for (Person person : preferenceScores.keySet()) {
            if (preferenceScores.get(person) > highestVal) {
                highest = person;
            }
        }

        return highest;
    }

    Film getHighestRating(Person person) {
        Film highestRatedFilm;
        int highestRating = Integer.MIN_VALUE;
        Map<Film, Rating> personsRatings = register.getPersonalRatings(person);

        for (Film film : personsRatings.keySet()) {
            if (personsRatings.get(film).getValue() > highestRating) {
                highestRatedFilm = film;
            }
        }

        return highestRatedFilm;
    }

    // look at others film ratings
    // Generate a preferenceScore with person
    // get person with highest preferenceScore with person
    // if that persons highest rated movie is above 0 (Neutral or above) return that movie
    // else return null;

    public Film recommendIntelligently(Person person) {
        Map<Film, Rating> personsRatings = register.getPersonalRatings(person);
        List<Person> reviewers = register.reviewers();

        Map<Person, Integer> preferenceScores = getPreferenceScores(person);

        // Get person with highest score
        Person personWithHighestScore = getPersonwithBestScore(preferenceScores);

        // Get that person's highest rated movie
        Film bestRatedFilmForPerson = getHighestRatedFilm(personWithHighestScore);

        int bestRatedFilmValue = register.getRating(personWithHighestScore, bestRatedFilmForPerson).getValue();

        return bestRatedFilmValue > 0 ? bestRatedFilmForPerson : null;
    }

    Film getHighestRatedFilm(Person person) {
        Map<Film, List<Rating>> filmRatings = register.filmRatings();
        FilmComparator filmComparator = new FilmComparator(filmRatings);

        List<Film> films = register.filmRatings().keySet().stream().collect(Collectors.toList());
        Collections.sort(films, filmComparator);
        return films.get(0);
    }

    public Film recommendFilm(Person person) {
        if (register.reviewers().contains(person)) {
            return recommendIntelligently(person);
        } else {
            return getHighestRatedFilm(person);
        }
    }
}
