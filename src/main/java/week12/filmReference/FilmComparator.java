package week12.filmReference;

import week12.filmReference.domain.Film;
import week12.filmReference.domain.Rating;

import java.util.*;

public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film f1, Film f2) {
        IntSummaryStatistics stats1 = ratings.get(f1).stream()
                .mapToInt(Rating::getValue)
                .summaryStatistics();

        IntSummaryStatistics stats2 = ratings.get(f2).stream()
                .mapToInt(Rating::getValue)
                .summaryStatistics();

        int f1Average = (int) (stats1.getAverage());
        int f2Average = (int) (stats2.getAverage());

        return f2Average - f1Average;

//        int f1Average = ratings.get(f1).stream()
//                .mapToInt(Rating::getValue)
//                .sum();
//        f1Average /= ratings.get(f1).size();
//
//        int f2Average = ratings.get(f2).stream()
//                .mapToInt(Rating::getValue)
//                .sum();
//        f2Average /= ratings.get(f2).size();
//
//        return f2Average - f1Average;
    }
}
