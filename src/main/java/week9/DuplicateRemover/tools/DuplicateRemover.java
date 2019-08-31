package week9.DuplicateRemover.tools;

import java.util.Set;

public interface DuplicateRemover {
    void add(String characterString); // add a char string
    int getNumberOfDetectedDuplicates(); // gets number of duplicates
    Set<String> getUniqueCharacterStrings(); // set of char strings, no duplicates, or empty set
    void empty(); // remove char strings and resets detected duplicate count
}
