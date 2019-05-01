package week2;

import java.util.Scanner;

public class PlayingWithNumbers {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        int count = 0;
        double average = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Type numbers: ");

        while (number != -1) {
            number = Integer.parseInt(reader.nextLine());

            if (number != -1) {
                sum += number;
                count++;
                average = (double) sum / count;

                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average is :" + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
