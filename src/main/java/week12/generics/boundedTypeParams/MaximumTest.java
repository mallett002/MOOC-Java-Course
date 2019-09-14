package week12.generics.boundedTypeParams;

import java.util.List;

// Determines the largest of three Comparable objects
public class MaximumTest {

    //access       <Type param>        return type   T methodName
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;

        return max;
    }

    public static void main(String[] args) {
        System.out.printf(
                "Max of %d, %d, and %d is %d\n\n", // format
                3, 4, 5, maximum(3, 4, 5) // what to format
        );
    }


    // WildCards "?"-----------------------------------------------------------------------------------------------------
    // This will throw error bc List<Building> isn't superType of List<House>:
    /*
    public static void paintBuildings(List<Building> buildings) {
        buildings.forEach(Building::paint);
    }
    */

    // This fixes it: "?" is anything that extends Building
    /*
    public static void doSomething(List<? extends Building> buildings) {
        buildings.forEach(Building::paint);
    }

    <? extends T>  is wildcard with upperbound
    <? super T> is wildcard with lowerbound
    */
}
