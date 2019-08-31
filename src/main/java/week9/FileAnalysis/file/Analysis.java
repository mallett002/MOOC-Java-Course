package week9.FileAnalysis.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Analysis {
    File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        int lineCount = 0;

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            lineCount++;
        }

        reader.close();
        return lineCount;
    }

    public int characters() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        int charCount = 0;

        while (reader.hasNext()) {
            charCount += reader.next().length();
        }

        return charCount;
    }
}
