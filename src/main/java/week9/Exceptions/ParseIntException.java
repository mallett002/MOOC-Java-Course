package week9.Exceptions;

import java.util.Scanner;

public class ParseIntException {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
//        System.out.print("Write a number: ");
//
//        try {
//            int num = Integer.parseInt(reader.nextLine());
//            System.out.println("Looks good!");
//        } catch (Exception e) { // Catch any Exceptions and run following code block
//            System.out.println("You haven't written a proper number.");
//        }
        readNumber(reader);
    }

    public static int readNumber(Scanner reader) {
        while (true) {
            System.out.print("Write a number: ");

            try {
                int num = Integer.parseInt(reader.nextLine());
                return num;
            } catch (Exception e) {
                System.out.println("You haven't written a proper number.");
            }
        }
    }
}
