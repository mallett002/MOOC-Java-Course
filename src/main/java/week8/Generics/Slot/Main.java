package week8.Generics.Slot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String... args) {
        // Slot<T> means we need to give a Type param to the constructor, so we can use String
        Slot<String> string = new Slot<>();
        string.setValue(":)");
        System.out.println(string.getValue());

        // Can make it an int as well
        Slot<Integer> num = new Slot<>();
        num.setValue(5);
        System.out.println(num.getValue());

        // ArrayLists and HashMaps make use of Generic Types
        List<String> list = new ArrayList<>();
        Map<String, String> keyCouples = new HashMap<>();

    }
}
