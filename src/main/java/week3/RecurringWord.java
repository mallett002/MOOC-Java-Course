package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    private static ArrayList<String> words = new ArrayList<>();
    private static Scanner reader = new Scanner(System.in);

    public static void main(String... args) {
        String word;

        while (true) {
            System.out.println("Type a word");
            word = reader.nextLine();
            if (!words.contains(word)) {
                words.add(word);
            } else {
                break;
            }
        }

        System.out.println("You gave the word " + word + " twice!");
    }
}
