package week9.MultipleEntryDictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    Map<String, Set<String>> translations;

    public PersonalMultipleEntryDictionary() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String entry) {
        if (!translations.containsKey(word)) {
            translations.put(word, new HashSet<>());
        }

        Set<String> translationsForWord = translations.get(word);
        translationsForWord.add(entry);
    }

    public Set<String> translate(String word) {
        return this.translations.get(word);
    }

    public void remove(String word) {
        this.translations.remove(word);
    }

}
