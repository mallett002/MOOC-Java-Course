package week6.ReverseAndCopyArray;

import java.util.Arrays;

public class Program {
    public static void main(String... args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] arr) {
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] arr) {
        int[] backwards = new int[arr.length];
        int detract = 1;

        for (int i = 0; i < arr.length; i++) {
            backwards[i] = arr[arr.length - detract];
            detract++;
        }
        return backwards;
    }
}
