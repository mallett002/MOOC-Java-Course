package week3;

import java.util.ArrayList;

public class LengthsOfStrings {
    public static ArrayList<Integer> getLengths(ArrayList<String> list) {
        // Gets list of strings and returns list of their lengths in same order
        ArrayList<Integer> listOfLengths = new ArrayList<>();

        for (String item : list) {
            int length = item.length();
            listOfLengths.add(length);
        }

        return listOfLengths;
    }

    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("howdy");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> listOfLengths = getLengths(list);

        System.out.println("The lengths: " + listOfLengths);
    }
}
