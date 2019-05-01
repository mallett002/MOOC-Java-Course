package week1;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        String notLeapYear = "The year is NOT a leap year.";
        String leapYear = "The year is a leap year.";

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(leapYear);
            } else {
                System.out.println(notLeapYear);
            }
        } else if (year % 4 == 0) {
            System.out.println(leapYear);
        } else {
            System.out.println(notLeapYear);
        }
    }
}
