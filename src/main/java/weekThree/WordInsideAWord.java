package weekThree;

import java.util.Scanner;

public class WordInsideAWord {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();

        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();

        if (isSecondFoundInFirst(firstWord, secondWord)) {
            System.out.println("The word " + secondWord + " is found in " + firstWord);
        } else {
            System.out.println("The word " + secondWord + " is not found in " + firstWord);
        }
    }

    private static boolean isSecondFoundInFirst(String first, String second) {
        int index = first.indexOf(second);
        return index >= 0;
    }
}
