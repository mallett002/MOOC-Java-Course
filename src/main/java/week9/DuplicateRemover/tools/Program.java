package week9.DuplicateRemover.tools;

import java.util.Set;

public class Program {
    public static void main(String[] args) {
        PersonalDuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");

        int numberOfDupes = remover.getNumberOfDetectedDuplicates();
        System.out.println("Number Of dupes: " + numberOfDupes);

        remover.add("last");
        remover.add("last");
        remover.add("new");

        numberOfDupes = remover.getNumberOfDetectedDuplicates();
        System.out.println("Number Of dupes: " + numberOfDupes);

        Set<String> uniqueCharStrings = remover.getUniqueCharacterStrings();
        System.out.println("Unique ones: " + uniqueCharStrings);

        remover.empty();

        System.out.println("Current number of duplicates: " +
                remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
                remover.getUniqueCharacterStrings());
    }
}
