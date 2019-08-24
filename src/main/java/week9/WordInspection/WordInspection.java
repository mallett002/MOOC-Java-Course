package week9.WordInspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    File file;

    public WordInspection(File file) {
        this.file = file;
    }

    private Scanner getReader() throws FileNotFoundException {
        return new Scanner(this.file, "UTF-8");
    }

    public int wordCount() throws FileNotFoundException {
        Scanner reader = getReader();
        int count = 0;

        while (reader.hasNextLine()) {
            reader.next();
            count++;
        }

        return count;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        Scanner reader = getReader();
        List<String> words = new ArrayList<>();

        while (reader.hasNextLine()) {
            String word = reader.nextLine().toLowerCase();

            if (word.contains("z")) {
                words.add(word);
            }
        }

        return words;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        Scanner reader = getReader();
        ArrayList<String> words = new ArrayList<>();

        while(reader.hasNextLine()) {
            String word = reader.nextLine().toLowerCase();

            if (word.endsWith("l")) {
                words.add(word);
            }
        }

        return words;
    }

    private boolean isDrome(String word) {
        String reverse = "";
        int lastIndex = word.length() - 1;

        for (int i = 0; i <= lastIndex; i++) {
            reverse += word.charAt(lastIndex - i);
        }

        return word.equals(reverse);
        // ----------Or do with string builder----------------------------------
        // StringBuilder builder = new StringBuilder();
        // builder.append(word);
        // builder.reverse();
        // String reversed = builder.toString();
        // return reversed.equals(word);
    }

    public List<String> palindromes() throws FileNotFoundException {
        Scanner reader = getReader();
        ArrayList<String> dromes = new ArrayList<>();

        while (reader.hasNextLine()) {
            String word = reader.nextLine();

            if (isDrome(word)) {
                dromes.add(word);
            }
        }

        return dromes;
    }

    public List<String> getWordsWithAllVowels() throws FileNotFoundException {
        Scanner reader = getReader();
        String[] finnishVowels = {"a", "e", "i", "o", "u", "y", "ä", "ö"};
        ArrayList<String> words = new ArrayList<>();

        while (reader.hasNextLine()) {
            String word = reader.nextLine();
            boolean wordIsValid = true;

            for (String vowel : finnishVowels) {
                if (!word.contains(vowel)) wordIsValid = false;
            }

            if (wordIsValid) words.add(word);
        }

        return words;
    }
}
