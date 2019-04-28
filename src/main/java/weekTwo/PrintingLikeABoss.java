package weekTwo;

public class PrintingLikeABoss {

    private static void printWhiteSpaces(int size) {
        int count = 0;

        while (count < size) {
            System.out.print(" ");
            count++;
        }
    }

    private static void printRightAlignedTri(int size) {
        PrintStars printObj = new PrintStars();

        for (int i = 0; i < size; i++) {
            int whiteSpaceSize = size - (i + 1);
            int starSize = i + 1;

            printWhiteSpaces(whiteSpaceSize);
            printObj.printStars(starSize);
        }
    }

    public static void main(String... args) {
        printRightAlignedTri(4);
    }
}
