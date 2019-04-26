package weekTwo;

import java.util.Scanner;

public class SumSetOfNums {
    public static void main(String... args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int addend = 1;

        System.out.print("Sum up to which number? ");
        int stopper = Integer.parseInt(reader.nextLine());

        while (addend <= stopper) {
            sum += addend;
            addend++;
        }
        System.out.println("Sum is " + sum);
    }
}
