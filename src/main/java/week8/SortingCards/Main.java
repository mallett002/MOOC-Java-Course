package week8.SortingCards;

import java.util.ArrayList;
import java.util.Collections;
// Collections can sort through interfaces Comparable<t> and Comparator<T>

public class Main {
    public static void main(String... args) {
        // Basic Sort---------------------------------------------------------------------------------------------------
        Hand hand = new Hand();

        hand.add(new Card(2, Card.SPADES));
        hand.add( new Card(14, Card.CLUBS) );
        hand.add( new Card(12, Card.HEARTS) );
        hand.add( new Card(2, Card.CLUBS) );

        hand.sort();
        hand.print();


        // Sorting hands -----------------------------------------------------------------------------------------------
        Hand hand1 = new Hand();

        hand1.add( new Card(2, Card.SPADES) );
        hand1.add( new Card(14, Card.CLUBS) );
        hand1.add( new Card(12, Card.HEARTS) );
        hand1.add( new Card(2, Card.CLUBS) );

        Hand hand2 = new Hand();

        hand2.add( new Card(11, Card.DIAMONDS) );
        hand2.add( new Card(11, Card.CLUBS) );
        hand2.add( new Card(11, Card.HEARTS) );

        int comparison = hand1.compareTo(hand2);

        if ( comparison < 0 ) {
            System.out.println("the most valuable hand contains the cards");
            hand2.print();
        } else if ( comparison > 0 ){
            System.out.println("the most valuable hand contains the cards");
            hand1.print();
        } else {
            System.out.println("the hands are equally valuable");
        }

        // Sorting against suit-----------------------------------------------------------------------------------------
        ArrayList<Card> cards = new ArrayList<Card>();

        cards.add( new Card(3, Card.CLUBS) );
        cards.add( new Card(2, Card.DIAMONDS) );
        cards.add( new Card(14, Card.CLUBS) );
        cards.add( new Card(12, Card.HEARTS) );
        cards.add( new Card(2, Card.CLUBS) );

        SortAgainstSuit suitSorter = new SortAgainstSuit();
        Collections.sort(cards, suitSorter);

        for (Card c : cards) {
            System.out.println(c);
        }

        // Sorting against suit and value-------------------------------------------------------------------------------
        Hand newHand = new Hand();

        newHand.add( new Card(12, Card.HEARTS) );
        newHand.add( new Card(4, Card.CLUBS) );
        newHand.add( new Card(2, Card.DIAMONDS) );
        newHand.add( new Card(14, Card.CLUBS) );
        newHand.add( new Card(7, Card.HEARTS) );
        newHand.add( new Card(2, Card.CLUBS) );

        newHand.sortAgainstSuit();
        newHand.print();
    }
}
