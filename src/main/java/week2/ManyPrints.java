package week2;

import java.util.Scanner;

public class ManyPrints {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        int count = 1;

        System.out.println("how many?");
        int number = Integer.parseInt(reader.nextLine());

        while (count <= number) {
            printText();
            count++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
