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
            if (reviewer != person) {
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
        }

        return preferenceScores;
    }

    private Person getPersonWithBestScore(Map<Person, Integer> preferenceScores) {
        Person firstPerson = preferenceScores.keySet().stream().findFirst().orElse(null);
        Person highestRatedPerson = firstPerson;
        int highestVal = Integer.MIN_VALUE;

        for (Person person : preferenceScores.keySet()) {
            if (preferenceScores.get(person) > highestVal) {
                highestRatedPerson = person;
                highestVal = preferenceScores.get(person);
            }
        }

        return highestRatedPerson;
    }

    private Film getHighestRating(Person person) {
        Film firstFilm = register.filmRatings().keySet().stream().findFirst().orElse(null);
        Film highestRatedFilm = firstFilm;
        int highestRating = Integer.MIN_VALUE;
        Map<Film, Rating> personsRatings = register.getPersonalRatings(person);

        for (Film film : personsRatings.keySet()) {
            if (personsRatings.get(film).getValue() > highestRating) {
                highestRatedFilm = film;
            }
        }

        return highestRatedFilm;
    }

    public Film recommendIntelligently(Person person) {
        Map<Person, Integer> preferenceScores = getPreferenceScores(person);

        Person personWithHighestScore = getPersonWithBestScore(preferenceScores);

        Film bestRatedFilmForPerson = getHighestRatedFilmForPerson(personWithHighestScore, person);

        int bestRatedFilmValue = register.getRating(personWithHighestScore, bestRatedFilmForPerson).getValue();

        return bestRatedFilmValue > 0 ? bestRatedFilmForPerson : null;
    }

    Film getHighestRatedFilmForPerson(Person otherPerson, Person person) {
        Set<Film> personRatings = register.getPersonalRatings(person).keySet();
        Map<Film, Rating> otherPersonRatings = register.getPersonalRatings(otherPerson);
        Film highestRatedFilm = otherPersonRatings.keySet().stream().findFirst().orElse(null);
        int currentHighestRating = Integer.MIN_VALUE;

        for (Film film : otherPersonRatings.keySet()) {
            if (otherPersonRatings.get(film).getValue() > currentHighestRating && !personRatings.contains(film)) {
                highestRatedFilm = film;
                currentHighestRating = otherPersonRatings.get(film).getValue();
            }
        }

        return highestRatedFilm;
    }

    private Film getHighestRatedFilm() {
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
            return getHighestRatedFilm();
        }
    }
}
