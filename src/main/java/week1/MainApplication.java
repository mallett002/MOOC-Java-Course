package week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class MainApplication {
    public static void main(String... args) {
//        System.out.println(upperVowels("hello")); //hEllO
//        System.out.println(upperVowels("dkkdkdk")); //hEllO
        printRandomCard();
    }

    enum Card {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    }

    enum Suit {
        HEARTS, DIAMONDS, SPADES, CLUBS;

    }

    private static void printRandomCard() {
        Random random = new Random();
        int card = random.nextInt(Card.values().length);
        int suit = random.nextInt(Suit.values().length);
        System.out.println(Card.values()[card] + " " + Suit.values()[suit]);
    }

    private static String upperVowels(String word) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        StringBuilder stringBuilder = new StringBuilder();

        for (char letter : word.toCharArray()) {
            if (vowels.contains(letter)) {
                stringBuilder.append(Character.toUpperCase(letter));
            } else {
                stringBuilder.append(letter);
            }
        }
        return stringBuilder.toString();
    }

}
