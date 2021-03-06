package week2;

import java.util.Scanner;

public class SumOfManyNumbers {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.println("Let's enter some numbers to find the sum.");
        while(true) {
            System.out.println("Enter a number.");
            int read = Integer.parseInt(reader.nextLine());

            if (read == 0) {
                break;
            }

            sum += read;

            System.out.println("NumberOfParams now: " + sum);
        }
        System.out.println("NumberOfParams in the end: " + sum);
    }
}
