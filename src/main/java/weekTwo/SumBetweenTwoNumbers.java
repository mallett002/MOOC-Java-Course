package weekTwo;

import java.util.Scanner;

public class SumBetweenTwoNumbers {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.print("First: ");
        int addend = Integer.parseInt(reader.nextLine());

        System.out.print("Last, make sure it's larger than the start: ");
        int end = Integer.parseInt(reader.nextLine());

        while (addend <= end) {
            sum += addend;
            addend++;
        }
        System.out.println("Sum: " + sum);
    }
}
