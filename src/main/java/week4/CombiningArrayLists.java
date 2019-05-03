package week4;

import java.util.ArrayList;

public class CombiningArrayLists {
    private static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second); // add all stuff from second into first
    }

    public static void main(String... args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        listOne.add(4);
        listOne.add(3);

        listTwo.add(5);
        listTwo.add(10);
        listTwo.add(7);

        combine(listOne, listTwo);

        System.out.println(listOne); // prints [4, 3, 5, 10, 7]
        System.out.println(listTwo); // prints [5, 10, 7]
    }
}
