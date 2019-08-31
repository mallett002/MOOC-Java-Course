package week9.phoneSearch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public void addPerson(String name) {
        this.people.put(name, new Person(name));
    }

//    public Set<String> getNumber(String name) {
//        return this.numbers.get(name);
//    }

//    public String getPersonByNumber(String number) {
//        String person = "Unknown";
//
//        for (String name : this.numbers.keySet()) {
//            Set<String> personsNumbers = this.numbers.get(name);
//
//            for (String possibleNumber : personsNumbers) {
//                if (possibleNumber.equals(number)) {
//                    person = name;
//                }
//            }
//        }
//
//        return person;
//    }
//
//    public void addAddress(String name, String street, String city) {
//        if (!this.addresses.containsKey(name)) {
//            this.addresses.put(name, new HashSet<>());
//        }
//
//        Set<String> address = this.addresses.get(name);
//        address.add(street);
//        address.add(city);
//    }
//
//    public String getPersonalInfo(String name) {
//        String addressString = "";
//        String numbersString = "";
//
//        if (!this.addresses.containsKey(name)) {
//            addressString = "address unknown";
//        }
//
//        if (!this.numbers.containsKey(name)) {
//            numbersString = "numbers unknown";
//        }
//
//        Object[] personsAddress = this.addresses.get(name).toArray();
//        Set<String> personsNumbers = this.numbers.get(name);
//
//        String street = personsAddress[1].toString();
//        String city = personsAddress[0].toString();
//
//        addressString = street + " " + city;
//
//        for (String number : personsNumbers) {
//            numbersString += number + "\n";
//        }
//
//        return "address: " + addressString + ", " + "\n"
//                + "phone numbers:\n"
//                + numbersString;
//    }

}
