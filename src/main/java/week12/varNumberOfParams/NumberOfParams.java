package week12.varNumberOfParams;

import java.util.Arrays;

public class NumberOfParams {
    public static void main(String... args) {
        int argCount = getArgCount(2, 5, 7);
        System.out.println(argCount); // --> 3

        int sum = sum(2, 5, 7);
        System.out.println(sum); // --> 14

        print(3, "boot", "scoot", "boogie");
    }

    // Can give as many (int)s as user wants with "table" param
    public static int getArgCount(int... values) {
        return values.length;
    }

    public static int sum(int... values) {
        // values is an array of ints
        return Arrays.stream(values).sum();
    }

    // method can only have 1 "table" param
    // table param has to be at end of arg list
    public static void print(int times, String... strings) {
        for (int i = 0; i < times; i++) {
            for (String string : strings) {
                System.out.println(string);
            }
            System.out.println("==");
        }
    }
}
