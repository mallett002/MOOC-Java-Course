package week6.StaticMethods;

public class ArrayHandling {
    public static void resetArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }
}
