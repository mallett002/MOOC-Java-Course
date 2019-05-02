package week3;

import java.util.ArrayList;

public class RemoveFirst {
    public static void print(ArrayList<String> list) {
        for (String word : list) {
            System.out.println(word);
        }
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0); // removes first item
    }

    public static void main(String... args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Pascal");
        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("C++");

        print(languages);

        removeFirst(languages);

        System.out.println(); // Print empty line

        print(languages);
    }
}
