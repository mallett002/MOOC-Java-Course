package week9.phoneSearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private Set<String> numbers;
    private String[] address;

    public Person(String name) {
        this.name = name;
        this.numbers = new HashSet<>();
        this.address = new String[2];
    }

    public void addNumber(String number) {
        numbers.add(number);
    }

    public Set<String> getNumbers() {
        return this.numbers;
    }

    public void addAddress(String street, String city) {
        this.address[0] = street;
        this.address[1] = city;
    }

    public String[] getAddress() {
        return this.address;
    }

    public boolean clearPersonalInfo() {
        try {
            this.numbers.clear();
            Arrays.fill(this.address, null);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
