package week6.Phonebook;

public class Main {
    public static void main(String... args) {
        // Creating Person----------------------------------------------------------------------------------------------
//        Person pekka = new Person("Pekka Mikkola", "040-123123");
//
//        System.out.println(pekka.getName());
//        System.out.println(pekka.getNumber());
//
//        System.out.println(pekka);
//        pekka.changeNumber("050-333444");
//        System.out.println(pekka);

        // Adding persons to the phonebook------------------------------------------------------------------------------
        Phonebook phonebook = new Phonebook();

        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

//        phonebook.printAll();
        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println(number);

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println(number);
    }
}
