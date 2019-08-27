package week9.HashMapMultipleValues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Map<String, List<String>> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Will", new ArrayList<>());

        // Add #s to Key "Will"
        phoneNumbers.get("Will").add("023-2343238");
        phoneNumbers.get("Will").add("191-2382383");

        Stream.of(phoneNumbers.get("Will"))
            .forEach(number -> System.out.println("number: " + number));
    }
}
