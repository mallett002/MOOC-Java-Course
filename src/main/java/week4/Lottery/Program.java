package week4.Lottery;

import java.util.ArrayList;

public class Program {
    public static void main(String... args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.getNumbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
    }
}
