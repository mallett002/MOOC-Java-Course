package week3;

import java.util.ArrayList;
//import java.util.Collections;

public class GreatestNumber {
    public static int greatest(ArrayList<Integer> list) {
        // First quick way to do it:
//        Collections.sort(list); // sort from smallest to biggest
//        return list.get(list.size() - 1); // return the last item (biggest)

        // Otherwise brute force approach:
        int greatest = 0;

        for (int i = 0; i < list.size() - 1; i++) { // loop until second to last item
            int current = list.get(i);
            int next = list.get(i + 1);

            if (next > current) {
                greatest = next;
            }
        }

        return greatest;
    }

    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(4);

        int greatest = greatest(list);
        System.out.println("The greatest number is: " + greatest);
    }
}
