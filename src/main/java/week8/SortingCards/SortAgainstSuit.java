package week8.SortingCards;

import java.util.Comparator; // For sorting by multiple criteria

// Class that places same suit cards together in a row
public class SortAgainstSuit implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        return card1.getSuit() - card2.getSuit();
    }
}
