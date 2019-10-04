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

    // TODO: Look at this
    public Film recommendFilm(Person person) {
        Map<Film, List<Rating>> filmRatings = register.filmRatings();
        FilmComparator filmComparator = new FilmComparator(filmRatings);

        List<Film> films = register.filmRatings().keySet().stream().collect(Collectors.toList());
        Collections.sort(films, filmComparator);

        if (register.reviewers().contains(person)) {// if the person has rated a movie
            // get highest recommendation other than their current rating
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
