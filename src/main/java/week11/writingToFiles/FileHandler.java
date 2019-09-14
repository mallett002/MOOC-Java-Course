package week11.writingToFiles;

import java.io.FileWriter;

public class FileHandler {

    public void writeToFile(String fileName, String text) throws Exception {
        FileWriter writer = new FileWriter(fileName);
        writer.write(text);
        writer.close();
    }

    public void appendToFile(String fileName, String text) throws Exception {
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(text);
        writer.close();
    }
}
