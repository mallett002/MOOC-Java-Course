package week3;

import java.util.Scanner;

public class FirstPart {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of first part: ");
        int length = Integer.parseInt(reader.nextLine());

        String firstPart = getFirstPart(word, length);
        System.out.println("Result: " + firstPart);
    }

    private static String getFirstPart(String word, int size) {
        return word.substring(0, size);
    }
}
