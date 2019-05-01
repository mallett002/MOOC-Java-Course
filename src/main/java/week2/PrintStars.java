package week2;

public class PrintStars {
    public static void printStars (int amount) {
        int count = 0;

        while (count < amount) {
            System.out.print("*");
            count++;
        }
        System.out.print("\n");
    }

    private static void printSquare(int sideSize) {
       // calls printStars
        int count = 0;

       while (count < sideSize) {
           printStars(sideSize);
           count++;
       }
    }

    private static void printRectangle(int width, int height) {
        int count = 0;
        // width is how many, height is amount times to call printStars
        while (count < height) {
            printStars(width);
            count++;
        }
    }

    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing stars");
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("Printing a squares");
        printSquare(4);

        System.out.println("Printing a rectangles");
        printRectangle(17, 3);

        System.out.println("Printing a triangle");
        printTriangle(4);
    }
}
