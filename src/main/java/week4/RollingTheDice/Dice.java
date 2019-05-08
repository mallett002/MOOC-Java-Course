package week4.RollingTheDice;

import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
    }

    public int roll() {
        // random number in the range 1-numberOfSides
        return this.random.nextInt(this.numberOfSides) + 1;
    }
}
