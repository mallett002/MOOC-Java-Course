package week10.personAndHeirs.people;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String... args) {
        // Student----------------------------------
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println( olli );
        olli.study();
        System.out.println( olli );

        // Teacher---------------------------------
        Teacher pekka = new Teacher(
                "Pekka Mikkola",
                "Korsontie Street 1 03100 Vantaa",
                1200
        );
        Teacher esko = new Teacher(
                "Esko Ukkonen",
                "Mannerheimintie 15 Street 00100 Helsinki",
                5400
        );
        System.out.println( pekka );
        System.out.println( esko );

        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );

        // Printing department
        List<Person> people = new ArrayList<>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

        printDepartment(people);

        // Person type only has methods defined in Person class
        Person will = new Student("Will", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(will);
        Person Tony = new Student("Tony", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println( olli ); // calls Student's toString

        Object liisa = new Student("Lisa", "Väinö Auerin Street 20 00500 Helsinki");
        System.out.println( liisa ); // calls Student's toString

    }

    public static void printDepartment(List<Person> people) {
        people.forEach(System.out::println);
    }
}
