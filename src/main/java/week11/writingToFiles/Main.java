package week11.writingToFiles;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("file.txt");
        writer.write("Hi file!\n");
        writer.write("Adding text\n");
        writer.write("And more\n");
        writer.close();
    }
}
