package week12.filmReference;

import week12.filmReference.domain.Film;
import week12.filmReference.domain.Person;
import week12.filmReference.domain.Rating;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        RatingRegister ratingRegister = new RatingRegister();

        Film goneWithTheWind = new Film("Gone with the Wind");
        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        Film eraserhead = new Film("Eraserhead");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");
        Person mikke = new Person("Mikke");

        ratingRegister.addRating(matti, goneWithTheWind, Rating.BAD);
        ratingRegister.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
        ratingRegister.addRating(matti, eraserhead, Rating.FINE);

        ratingRegister.addRating(pekka, goneWithTheWind, Rating.FINE);
        ratingRegister.addRating(pekka, theBridgesOfMadisonCounty, Rating.BAD);
        ratingRegister.addRating(pekka, eraserhead, Rating.MEDIOCRE);

        Reference reference = new Reference(ratingRegister);

        Film recommendedMike = reference.recommendFilm(mikke);
        System.out.println("The film recommended to Michael is: " + recommendedMike);

        Film recommendedMatti = reference.recommendFilm(matti);
        System.out.println("The film recommended to Matti is: " + recommendedMatti);
    }
}
