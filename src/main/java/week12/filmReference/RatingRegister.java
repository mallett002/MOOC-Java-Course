package week12.filmReference;

import week12.filmReference.domain.Film;
import week12.filmReference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {
    Map<Film, List<Rating>> films;

    public RatingRegister() {
        this.films = new HashMap<>();
    }

    public void addRating(Film film, Rating rating) {
        if (!films.containsKey(film)) {
            films.put(film, new ArrayList<>());
        }

        List<Rating> ratings = films.get(film);
        ratings.add(rating);
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
