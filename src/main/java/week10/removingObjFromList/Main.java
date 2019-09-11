package week10.removingObjFromList;

import week10.printer.Printer;

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        // Make a list of printers
        ArrayList<Printer> printers = new ArrayList<>();
        printers.add(new Printer());
        printers.add(new Printer());
        printers.add(new Printer());

        // Removing one from the list
        ArrayList<Printer> toBeRemoved = new ArrayList<>();

        for (int i = 0; i < printers.size(); i++) {
            if (i == printers.size() - 1) {
                toBeRemoved.add(printers.get(i)); // remove the last one
            }
        }

        printers.removeAll(toBeRemoved);
    }
}
