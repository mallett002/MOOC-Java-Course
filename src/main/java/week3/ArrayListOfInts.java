package week3;

import java.util.ArrayList;

public class ArrayListOfInts {
    public static void main(String... args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(8);
        numbers.add(2);

        numbers.remove(Integer.valueOf(4));

        System.out.println(numbers);
    }
}
