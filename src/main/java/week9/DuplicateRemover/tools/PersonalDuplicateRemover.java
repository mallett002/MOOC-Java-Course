package week9.DuplicateRemover.tools;

import week5.Person.Person;
import week9.MultipleEntryDictionary.PersonalMultipleEntryDictionary;

import java.util.HashSet;
import java.util.Set;

// Store given char strings, removing duplicates
// Keeps record of amnt of duplicates
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> characterStrings;
    private int numberOfDupes;

    public PersonalDuplicateRemover() {
        this.characterStrings = new HashSet<>();
        this.numberOfDupes = 0;
    }

    public void add(String characterString) {
        if (this.characterStrings.contains(characterString)) {
            this.numberOfDupes++;
        }

        this.characterStrings.add(characterString);
    }

    public void print() {
        this.characterStrings.stream()
            .forEach(charString -> System.out.print(charString + " "));
    }

    public int getNumberOfDetectedDuplicates() {
        return this.numberOfDupes;
    }

    public Set<String> getUniqueCharacterStrings() {
        return this.characterStrings;
    }

    public void empty() {
        this.characterStrings.clear();
        this.numberOfDupes = 0;
    }
}
