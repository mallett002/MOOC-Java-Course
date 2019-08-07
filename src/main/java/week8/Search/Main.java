package week8.Search;

import week8.Generics.ComparableInterface.ClubMember;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Collections.binarySearch() Method------------------------------------------------------------------------------------------
        // binarySearch() returns index of searched key. If none found, returns negative number.
        // Uses comparable interface. If "compareTo()" returns 0 (same obj), it's found.
        List<ClubMember> clubMembers = new ArrayList<>();
        clubMembers.add(new ClubMember("mikael", 182));
        clubMembers.add(new ClubMember("matti", 187));
        clubMembers.add(new ClubMember("joel", 184));

        // BinarySearch needs the list to be sorted before use
        Collections.sort(clubMembers);

        ClubMember wanted = new ClubMember("Name", 180);
        int index = Collections.binarySearch(clubMembers, wanted); // Search for wanted in clubMembers
        if (index >= 0) {
            System.out.println("A person who is 180 centimeters tall was found at index " + index);
            System.out.println("name: " + clubMembers.get(index).getName());
        }

        wanted = new ClubMember("Name", 187);
        index = Collections.binarySearch(clubMembers, wanted);

        if (index >= 0) {
            System.out.println("A person who is 187 centimeters tall was found at index " + index);
            System.out.println("name: " + clubMembers.get(index).getName());
        }
    }
}
