package weekThree;

import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    static private ArrayList<String> words = new ArrayList<>();
    private static Scanner reader = new Scanner(System.in);
    protected static String word;

    public static void main(String... args) {

        generateAndAddWord();

        while (!word.isEmpty())  {
            generateAndAddWord();
        }

        System.out.println("You typed the following words:");
        for (String palabra : words) {
            System.out.println(palabra);
        }
    }

    private static void generateAndAddWord() {
        System.out.println("Type a word");
        word = reader.nextLine();
        words.add(word);
    }
}
