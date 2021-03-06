package week10.abstractClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserInterface {

    private Scanner reader;
    private List<Operation> operations;

    UserInterface(Scanner reader) {
        this.reader = reader;
        this.operations = new ArrayList<>();
    }

    void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    void start() {
        while (true) {
            printOperations();
            System.out.print("Choice: ");

            String choice = this.reader.nextLine();
            if (choice.equals("0")) {
                break;
            }

            executeOperation(choice);
            System.out.println();
        }
    }

    private void printOperations() {
        System.out.println("\t0: Quit");
        for (int i = 0; i < this.operations.size(); i++) {
            String operationName = this.operations.get(i).getName();
            System.out.println("\t" + (i + 1) + ": " + operationName);
        }
    }

    private void executeOperation(String choice) {
        int operation = Integer.parseInt(choice);

        Operation chosen = this.operations.get(operation - 1);
        chosen.execute(reader);
    }
}
