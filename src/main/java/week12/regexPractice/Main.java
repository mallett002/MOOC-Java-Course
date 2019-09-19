package week12.regexPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Week Days
        System.out.print("Give a day abbreviation: ");
        boolean isDay = isAWeekDay(reader.nextLine());
        printForm(isDay);

        // Vowel Inspection
        System.out.print("Give a string: ");
        String line = reader.nextLine();
        boolean containesOnlyVowels = allVowels(line);
        printForm(containesOnlyVowels);

        // Clock time
        System.out.print("Give a time: ");
        boolean isTime = clockTime(reader.nextLine());
        printForm(isTime);
    }

    private static void printForm(boolean isValid) {
        if (isValid) {
            System.out.println("The form is fine");
        } else {
            System.out.println("The form is wrong");
        }
    }

    private static boolean isAWeekDay(String str) {
        return str.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    private static boolean allVowels(String str) {
        return str.matches("[aeiou]*");
    }

    public static boolean clockTime(String string) {
        String regex = "([0-1][0-9]|2[0-3])(:[0-5][0-9]){2}";
        return string.matches(regex);
    }
}
