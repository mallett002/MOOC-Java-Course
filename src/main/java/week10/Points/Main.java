package week10.Points;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<Point> points = new ArrayList<>();

        // make normal and colored points
        points.add(new Point(4, 8));
        points.add(new ColoredPoint(1, 1, "green"));
        points.add(new ColoredPoint(2, 5, "blue"));
        points.add(new Point(0, 0));
        points.add(new ThreeDPoint(5, 2, 8));

        // Will call toString of each
        // Colored points toString will be called for ColoredPoints
        points.forEach(System.out::println);
    }
}
