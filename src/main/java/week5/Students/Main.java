package week5.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.print("name: ");
            String studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            Student student = new Student(studentName, studentNumber);
            list.add(student);
        }

        for (Student student : list) {
            System.out.println(student);
        }

        System.out.print("Give search term: ");
        String term = reader.nextLine();

        for (Student student : list) {
            if (student.getName().contains(term)) {
                System.out.println(student);
            }
        }
    }
}
