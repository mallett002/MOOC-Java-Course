package week8.InternalInterfaces;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String... args) {
        // Map Interface  ----------------------------------------------------------------------------------------------
        // HashMap implements Map Interface:
        Map<String, String> translations = new HashMap<>();
        translations.put("hi", "oi");
        translations.put("what's up", "e ai");
        translations.put("good luck", "boa sorte");
        translations.put("yes", "sim");

        // Access HashMap keys through keySet() method
        for(String key : translations.keySet()) {
            System.out.println(key + ": " + translations.get(key));
        }
        // Also a values() method to access HashMap values

        // Set Interface -----------------------------------------------------------------------------------------------
        // Set can only have 1 of each "thing"
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("three");

        for (String key : set) {
            System.out.println(key); //--> one, three
        }

        // Collection Interface ----------------------------------------------------------------------------------------
        // List and Set are Collections (They implement Collection interface
        // Map.values() returns a Collection
        // Collection.contains() & Collection.size()
        Map<String, String> newTranslations = new HashMap<>();
        newTranslations.put("gambatte", "good luck");
        newTranslations.put("hai", "yes");

        Set<String> keys = newTranslations.keySet(); // Since newTranslations is a Map, has keySet()
        Collection<String> keySet = keys; // Can assign new Collection from the Set, since Set implements Collection

        System.out.println("Keys:");
        for(String key : keySet) { // can loop over Collection
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values:");
        Collection<String> values = translations.values(); // Map has values() which returns a Collection
        for(String value : values) {
            System.out.println(value);
        }
    }
}
