package week9.WordInspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\bench\\MOOC\\src\\main\\java\\week9\\WordInspection\\shortlist.txt");
        WordInspection inspector = new WordInspection(file);

        System.out.print("Number of words: ");
        int fileCount = inspector.wordCount();
        System.out.println(fileCount);

        System.out.println("-------------");
        System.out.print("Words that contain a 'z': ");
        List<String> wordsWithZ = inspector.wordsContainingZ();
        System.out.println(wordsWithZ);

        System.out.println("-------------");
        System.out.print("Words end in 'l': ");
        List<String> wordsEndingInL = inspector.wordsEndingInL();
        System.out.println(wordsEndingInL);

        System.out.println("-------------");
        System.out.print("Words that are palindromes: ");
        List<String> palindromes = inspector.palindromes();
        System.out.println(palindromes);

        System.out.println("-------------");
        List<String> wordsWithAllVowels = inspector.getWordsWithAllVowels();
        System.out.print("Words with all vowels: ");
        System.out.println(wordsWithAllVowels);
    }
}
