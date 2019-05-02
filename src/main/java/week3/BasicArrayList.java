package week3;

import java.util.ArrayList;
import java.util.Collections;

public class BasicArrayList {
    public static void main(String... args) {
        ArrayList<String> teachers = new ArrayList<String>();

        teachers.add("Anthony");
        teachers.add("Barto");
        teachers.add("Paul");
        teachers.add("John");
        teachers.add("Martin");
        teachers.add("Matt");

        System.out.println("the number of teachers " + teachers.size());

        System.out.println("First teacher on the list: " + teachers.get(0));
        System.out.println("Third teacher on the list: " + teachers.get(2));

        teachers.remove("Barto");

        Collections.sort(teachers);
        // Other Collections methods:
        // Collections.shuffle() & Collections.reverse()

        for (String teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
