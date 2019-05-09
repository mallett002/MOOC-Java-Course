package week4.Hangman;

import java.util.Scanner;

public class Program {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        HangmanLogic game = new HangmanLogic("jumbalaya");

        System.out.println("Welcome to hangman!");

        while (game.numberOfFaults() < 13) {
            System.out.println("guessed letters: " + game.guessedLetters());
            System.out.println("number of faults: " + game.numberOfFaults());
            System.out.println("Guess a letter: ");
            String guess = reader.nextLine().toUpperCase();
            game.guessLetter(guess);
            System.out.println("word now: " + game.hiddenWord());
        }
    }

}
