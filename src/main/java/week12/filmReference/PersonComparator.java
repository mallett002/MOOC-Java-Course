package week12.filmReference;

import week12.filmReference.domain.Person;

import java.util.Comparator;
import java.util.Map;

public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> people;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.people = peopleIdentities;
    }

    @Override
    public int compare(Person p1, Person p2) {
        return people.get(p2) - people.get(p1);
    }
}
