package week6.StaticMethods;

public class Program {
    public static void main(String... args) {
        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Call Static methods from other classes
        ArrayHandling.resetArray(values);

        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
