package week9.FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String... args) throws FileNotFoundException, Exception {
        // Get the file
        File file = new File("C:\\bench\\MOOC\\src\\main\\java\\week9\\FileReading\\hello-world.txt");

        // Help find the file's path:
        System.out.println(new File(".").getAbsolutePath());
        System.out.println("File exists ? " + file.exists());
        System.out.println("Is dir ? " + file.isDirectory());
        System.out.println("Can Read ? " + file.canRead());

        // Read the file
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {          // while there's a next line
            String line = reader.nextLine();    // get the line
            System.out.println(line);           // print it out
        }

        reader.close();                         // close the file

        // *** Print every 5th word ***
        FileReader fileReader = new FileReader();
        File exceptionsText = new File("C:\\bench\\MOOC\\src\\main\\java\\week9\\FileReading\\exceptions.txt");

        fileReader.printEveryFifth(exceptionsText); // main() throws Exception handles the Exception

    }
}
