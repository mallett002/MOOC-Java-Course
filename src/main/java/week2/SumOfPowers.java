package week2;

import java.util.Scanner;

public class SumOfPowers {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        int result = 0;

        System.out.print("Type a number ");
        int endPower = Integer.parseInt(reader.nextLine());

        while (count <= endPower) {
            result += (int) Math.pow(2, count);
            count++;
        }

        System.out.println("The result is " + result);
    }
}
