package week4.Hangman;

public class HangmanLogic {
    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (!guessedLetters.contains(letter)) {
            numberOfFaults++;
            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        String guessLetter;

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            guessLetter = Character.toString(currentChar);

            if (guessedLetters.contains(guessLetter)) {
                hiddenWord += guessLetter;
            } else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;
    }
}
