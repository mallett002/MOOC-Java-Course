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

    // movie taste score = (p1Movie1Rating * p2Movie1Rating) + (p1Movie2Rating) + (p2Movie2Rating);
    // Get movie taste score with others. Find highest. Get that persons highest rated
    private int getPreferenceScoreForMovie(Person p1, Person p2, Film film) {
        int ratingP1 = register.getRating(p1, film).getValue();
        int ratingP2 = register.getRating(p2, film).getValue();
        return ratingP1 * ratingP2;
    }

    // Return null if:
        // Can't find film to recommend: If find that best film is neutral or below
    public Film recommendIntelligently(Person person) {
        // look at others film ratings
        // Generate a preferenceScore with person
        // get person with highest preferenceScore with person
        // if that persons highest rated movie is above 0 (Neutral or above) return that movie
            // else return null;
        Map<Person, Integer> preferenceScores = new HashMap<>();
        Map<Film, Rating> personsRatings = register.getPersonalRatings(person);
        List<Person> reviewers = register.reviewers();

        // Build up preferenceScores
        reviewers.stream()
            .filter(p -> p != person)
            .forEach(otherPerson -> {
                Map<Film, Rating> othersRatings = register.getPersonalRatings(otherPerson);
                // look through movies. if both reviewed, get score. else 0
                personsRatings.keySet().stream()
                    .filter(film -> othersRatings.containsKey(film))
                    .forEach(film -> {
                        preferenceScores.put(otherPerson, getPreferenceScoreForMovie(person, otherPerson, film));
                    });
            });

        // TODO: this thing...
        // Get person with highest preferenceScore
        // Return highest rated film of that person, if is rated higher than 0 (Neutral or above)
        preferenceScores.keySet().stream()

    }

    public Film recommendFilm(Person person) {
        // If person hasn't evaluated a film, get highest rated, otherwise get highest rated other than theirs

        // Make list of films and sort according to ratings, highest first
        Map<Film, List<Rating>> filmRatings = register.filmRatings();
        FilmComparator filmComparator = new FilmComparator(filmRatings);

        List<Film> films = register.filmRatings().keySet().stream().collect(Collectors.toList());
        Collections.sort(films, filmComparator);

        // if the person has rated a movie, get highest recommendation other than their current rating
        if (register.reviewers().contains(person)) {
            Film personsRatedFilm = register.getPersonalRatings(person).keySet().stream()
                    .findFirst().orElse(null);

            // look at films other than "personsRatedFilm" and get the one with highest rating
            return films.stream()
                    .filter(film -> film != personsRatedFilm)
                    .findFirst()
                    .get();
        } else {
            return films.get(0);
        }

    }
}
