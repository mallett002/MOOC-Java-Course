package week11.fileHandler;

import week11.writingToFiles.FileHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        FileHandler handler = new FileHandler();
        handler.writeToFile("diary.txt", "Dear Diary, today was a nice day.");
    }
}
