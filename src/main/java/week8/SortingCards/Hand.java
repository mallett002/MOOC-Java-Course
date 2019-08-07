package week8.SortingCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cardList;

    public Hand() {
        cardList = new ArrayList<>();
    }

    public void add(Card card) {
        cardList.add(card);
    }

    public void print() {
        for (Card card : cardList) {
            System.out.println(card.getCardValue() + " of " + card.getCardSuit());
        }
    }

    public void sort() {
        // Collections.sort() uses compareTo
        Collections.sort(cardList);
    }

    @Override
    public int compareTo(Hand hand) {
        int thisListSum = 0;
        int handListSum = 0;

        for (Card card : cardList) {
            thisListSum += card.getValue();
        }

        for (Card card : hand.getCardList()) {
            handListSum += card.getValue();
        }

        return thisListSum - handListSum;
    }

    public ArrayList<Card> getCardList() {
        return this.cardList;
    }

    public void sortAgainstSuit() {
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(cardList, suitSorter);
    }
}
