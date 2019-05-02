package week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class IsNumberMoreThanOnce {
    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int count = 0;

        for (int num : list) {
            if (num == number) count++;
        }

        return count > 1;
    }

    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        boolean numberOccursMoreThanOnce = moreThanOnce(list, number);

        if (numberOccursMoreThanOnce) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
    }
}
