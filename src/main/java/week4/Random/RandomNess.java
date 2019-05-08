package week4.Random;

import java.util.Random;

public class RandomNess {
    public static void main(String... args) {
        Random randomizer = new Random(); // creates random generator
        int i = 0;

        while (i < 10) {
            System.out.println(randomizer.nextInt(10));
            i++;
        }
    }
}
