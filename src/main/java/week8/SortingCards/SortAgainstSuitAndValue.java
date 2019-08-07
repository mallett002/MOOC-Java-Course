package week8.SortingCards;

import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        int comparedSuit = card1.getSuit() - card2.getSuit();
        int comparedValue = card1.getValue() - card2.getValue();

        if (comparedSuit == 0) {
            return comparedValue;
        } else {
            return comparedSuit;
        }
    }
}
