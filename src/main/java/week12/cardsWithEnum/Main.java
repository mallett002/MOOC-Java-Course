package week12.cardsWithEnum;

public class Main {
    public static void main(String[] args) {
        Card first = new Card(10, Suit.HEARTS);

        System.out.println(first);

        if (first.getSuit() == Suit.CLUBS) {
            System.out.println("It's clubs");
        } else {
            System.out.println("It's not clubs");
        }
    }
}
