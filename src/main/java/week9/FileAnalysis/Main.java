package week9.FileAnalysis;

import week9.FileAnalysis.file.Analysis;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\bench\\MOOC\\src\\main\\java\\week9\\FileAnalysis\\testFile.txt");
        Analysis analysis = new Analysis(file);
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Characters: " + analysis.characters());
    }
}
