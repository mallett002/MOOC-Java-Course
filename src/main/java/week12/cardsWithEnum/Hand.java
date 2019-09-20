package week12.cardsWithEnum;

import java.util.ArrayList;
import java.util.Iterator;

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            Card nextCard = iterator.next(); // Get the card
            System.out.println(nextCard);
        }
    }

    // Can remove item from list while looping with iterator
    public void deleteWorst(int value) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue() < value) {
                iterator.remove();
            }
        }
    }
}
