package week6.Phonebook;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook;

    public Phonebook() {
        phonebook = new ArrayList<>();
    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        phonebook.add(person);
    }

    public void printAll() {
        for (Person person : phonebook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        Person person = phonebook.stream()
                .filter(contact -> contact.getName().equals(name)) // get the person with that name
                .findAny() // wrap filtered Array in Optional object
                .orElse(null); // set to null if Optional is empty

        if (person != null) {
            return person.getNumber();
        }
        return "no number found";
    }
}
