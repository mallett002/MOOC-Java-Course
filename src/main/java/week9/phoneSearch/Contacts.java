package week9.phoneSearch;

import java.util.*;

public class Contacts {
    private Map<String, Person> people;

    public Contacts() {
        this.people = new HashMap<>();
    }

    Person getPerson(String name) {
        return this.people.get(name);
    }

    public Map<String, Person> getPeople() {
        return this.people;
    }

    public boolean addPerson(String name) {
        try {
            this.people.put(name, new Person(name));
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public boolean removePerson(String name) {
        try {
            this.people.remove(name);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public Set<Person> findPeopleByKeyword(String keyword) {
        Set<Person> found = new HashSet<>();

        this.people.keySet()
                .forEach(name -> {
                    if (name.toLowerCase().contains(keyword.toLowerCase())) {
                        found.add(people.get(name));
                    }
                    else {
                        Arrays.asList(people.get(name).getAddress())
                                .stream()
                                .forEach(item -> {
                                    if (item != null) {
                                        if (item.toLowerCase().contains(keyword.toLowerCase())) {
                                            found.add(people.get(name));
                                        }
                                    }
                                });
                    }
                });

        return found;

    }
}
