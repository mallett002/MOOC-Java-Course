package week9.Printer;

import java.io.File;
import java.util.Scanner;

public class Printer {
    private File file;
    private Scanner reader;

    public Printer(String fileName) {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        if (word.isEmpty()) {
            throw new IllegalArgumentException("You must provide a word");
        } else {
            this.reader = new Scanner(this.file);

            while(reader.hasNextLine()) {
                String line = reader.nextLine();

                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        }
    }

    public void closeReader() {
        this.reader.close();
    }
}
