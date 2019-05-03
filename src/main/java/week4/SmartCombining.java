package week4;

import java.util.ArrayList;

public class SmartCombining {
    private static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int item : second) {
            if (!first.contains(item)) {
                first.add(item);
            }
        }
    }

    public static void main(String... args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();

        firstList.add(9);
        firstList.add(7);

        secondList.add(9);
        secondList.add(10); // this should be only item that gets added when smartCombine is called
        secondList.add(7);

        System.out.println("Before combining: " + firstList);
        smartCombine(firstList, secondList);
        System.out.println("After combining" + firstList);
    }
}
