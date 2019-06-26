package week6.PrintStars;

public class Main {
    public static void main(String... args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int amount : array) {
            for (int i = 1; i <= amount; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
