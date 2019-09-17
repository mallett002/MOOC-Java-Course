package week12.regexPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Week Days
        System.out.print("Give a day abbreviation: ");
        boolean isDay = isAWeekDay(reader.nextLine());
        System.out.println(isDay);
    }

    public static boolean isAWeekDay(String str) {
        String[] days = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};

        // Todo: use stream
//        for (String day : days) {
//            if (str.matches(day)) return true;
//        }
//        return false;
        boolean isDay = Arrays.stream(days)
                .reduce(false, (dayOne, dayTwo) -> {

                });

    }
}
