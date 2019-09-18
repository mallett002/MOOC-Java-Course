package week12.regexPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Week Days
        System.out.print("Give a day abbreviation: ");
        boolean isDay = isAWeekDay(reader.nextLine());
        printForm(isDay);
    }

    private static void printForm(boolean isValid) {
        if (isValid) {
            System.out.println("The form is fine");
        } else {
            System.out.println("The form is wrong");
        }
    }

    private static boolean isAWeekDay(String str) {
        String[] days = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};

        return Arrays.stream(days)
                .anyMatch(str::matches);

    }
}
