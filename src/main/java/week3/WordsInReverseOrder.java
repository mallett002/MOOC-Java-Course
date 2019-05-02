package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    private static Scanner reader = new Scanner(System.in);
    private static ArrayList<String> words = new ArrayList<>();
    private static String word;

    public static void main(String... args) {
        generateWord();

        while (!word.isEmpty()) {
            generateWord();
        }

        Collections.reverse(words);
        // Collections.sort(words); for alphabetical order

        System.out.println("you typed the following words:");

        for (String palabra : words) {
            System.out.println(palabra);
        }
    }

    private static void generateWord() {
        System.out.println("Type a word");
        word = reader.nextLine();
        words.add(word);
    }
}
