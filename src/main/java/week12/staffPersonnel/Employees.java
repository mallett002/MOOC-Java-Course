package week12.staffPersonnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> people;

    public Employees() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public void add(List<Person> persons) {
        people.addAll(persons);
    }

    public void fire(Education education) {
        Iterator<Person> it = people.iterator();

        while (it.hasNext()) {
            Person person = it.next();

            if (person.getEducation() == education) {
                it.remove();
            }
        }
    }

    public void print() {
        Iterator<Person> it = people.iterator();

        while (it.hasNext()) {
            Person person = it.next();
            System.out.println(person);
        }
    }

    public void print(Education education) {
        Iterator<Person> it = people.iterator();

        while (it.hasNext()) {
            Person person = it.next();

            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }
}
