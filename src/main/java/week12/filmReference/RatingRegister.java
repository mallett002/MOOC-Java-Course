package week12.filmReference;

import week12.filmReference.domain.Film;
import week12.filmReference.domain.Person;
import week12.filmReference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RatingRegister {
    Map<Film, List<Rating>> films;
    Map<Person, Map<Film, Rating>> personRatings;

    public RatingRegister() {
        this.films = new HashMap<>();
        this.personRatings = new HashMap<>();
    }

    public void addRating(Film film, Rating rating) {
        if (!films.containsKey(film)) {
            films.put(film, new ArrayList<>());
        }

        List<Rating> ratings = films.get(film);
        ratings.add(rating);
    }

    public void addRating(Person person, Film film, Rating rating) {
        this.addRating(film, rating);

        // adds rating of film to person
        if (!personRatings.containsKey(person)) {
            personRatings.put(person, new HashMap<>());
        }

        Map<Film, Rating> ratingForPerson = new HashMap<>();
        ratingForPerson.put(film, rating);
        personRatings.put(person, ratingForPerson);
    }

    public Rating getRating(Person person, Film film) {
        Map<Film, Rating> ratingForPerson = personRatings.get(person);
        return ratingForPerson.get(film);
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        return personRatings.get(person);
    }

    public List<Person> reviewers() {
        return personRatings.keySet().stream().collect(Collectors.toList());
    }

    public List<Rating> getRatings(Film film) {
        if (films.containsKey(film)) {
            return films.get(film);
        }

        return null;
    }

    public Map<Film, List<Rating>> filmRatings() {
        return films;
    }
}
