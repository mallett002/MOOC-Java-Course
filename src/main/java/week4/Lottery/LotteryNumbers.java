package week4.Lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;
    private int lotteryNumberLength = 7;
    private int max = 39;
    private int min = 1;

    public LotteryNumbers() {
        this.numbers = new ArrayList<>();
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> getNumbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int lotteryNumber = 0;
        for (int i = 0; i < lotteryNumberLength; i++) {
            while (containsNumber(lotteryNumber) || lotteryNumber == 0) {
                lotteryNumber = generateNumber();
            }
            numbers.add(lotteryNumber);
        }
    }

    private int generateNumber() {
        return random.nextInt(max) + min;
    }

    private boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
