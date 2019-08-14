package week9.Exceptions;

import java.util.Scanner;

public class ThrowingExceptions {
    public static void main(String... args) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) { // Handle the exception
            // do nothing if there's an error
        }

        // *** NumberFormatException ***
        Scanner reader = new Scanner(System.in);
        try {
            int num = Integer.parseInt(reader.nextLine());
        } catch (Exception e) {
            throw new NumberFormatException();
        }

        // *** IllegalArgumentException ***
        // To make sure method receives correct args
//        throw new IllegalArgumentException();
    }

    // Or handle exception in a method
    public void sleep(int sec) throws Exception {
        Thread.sleep(sec * 1000); // Now don't need try-catch
    }

}
