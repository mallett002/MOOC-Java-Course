package week6.MultiplicationTable;

public class MultiplicationTable {
    public void print(int upTo) {
        for (int i = 1; i <= upTo; i++) {
            printMultiplicationTableRow(i, upTo);
            System.out.println();
        }
    }

    public void printMultiplicationTableRow(int multiplier, int howManyTimes) {
        for (int j = 1; j <= howManyTimes; j++) {
            System.out.print(j * multiplier + " ");
        }
    }

    public static void main(String... args) {
        // Printing multiplication table
        MultiplicationTable table = new MultiplicationTable();
        table.print(5);
    }
}
