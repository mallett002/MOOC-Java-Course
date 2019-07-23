package week8.EBook;

import week8.Readable.Readable;
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        SMS message = new SMS("ope", "Awesome stuff!");
        System.out.println(message.read());

        ArrayList<SMS> messages = new ArrayList<>();
        messages.add(new SMS("unknown number", "I hid the body."));

        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Split your method into short clear chunks.");
        pages.add("Divide the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        EBook book = new EBook("Programming Hints", pages);
        for (int page = 0; page < book.howManyPages(); page++) {
            System.out.println(book.read());
        }

        // Type casting-------------------------------------------------------------------------------------------------
        // Can assign child obj to interface obj
        Readable readable = new SMS("teacher", "The SMS is Readable!"); // works
        // But can't assign interface obj to implemented (child) obj
        // SMS message = readable; // Doesn't work. SMS isn't the only class to implement Readable
        // Can cast it though. If variable is what we want to turn it into (an SMS obj in this case)
        SMS transformedMessage = (SMS) readable; // works
    }

}
