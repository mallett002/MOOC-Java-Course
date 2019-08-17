package week9.FileReading;

import java.io.File;
import java.util.Scanner;

public class FileReader {

    // Can handle the exceptions when the file is opened:
    public void readFileAndHandleErrors(File f) {
        // The file we read:
        Scanner reader = null;

        try {
            reader = new Scanner(f);
        } catch (Exception e) {
            System.out.println("We couldn't read the file. Error: " + e.getMessage());
            return; // we exit the method
        }

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);
        }

        reader.close();
    }

    // Or delegate exception handling to method caller:
    public String readFile(File f) throws Exception {
        // the file we read
        Scanner reader = new Scanner(f);

        String string = "";

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            string += line;
            string += "\n";
        }

        reader.close();
        return string;
    }

    // Print every 5th word of a file:
    public void printEveryFifth(File f) throws Exception {
        Scanner reader = new Scanner(f);

        int numberCount = 0;

        while(reader.hasNext()) { // hasNext() is true if something more to read
            numberCount++;
            String word = reader.next(); // next() reads following word and returns String obj

            if (numberCount % 5 == 0) { // if number of word is divisible by 5 print it
                System.out.println(word);
            }
        }
    }
}
