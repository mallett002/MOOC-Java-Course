package week9.ExerciseAccounting;

public class Program {
    public static void main(String... args) {
        // Using HashSet
        ExerciseAccountingSet account = new ExerciseAccountingSet();
        account.add(1);
        account.add(1);
        account.add(2);
        account.add(3);

        account.print(); // --> 1 2 3

        // Using HashMap
        ExerciseAccountingMap accountMap = new ExerciseAccountingMap();
        accountMap.add("Mikael", 3);
        accountMap.add("Mikael", 4);
        accountMap.add("Mikael", 3);
        accountMap.add("Mikael", 3);

        accountMap.add("Pekka", 4);
        accountMap.add("Pekka", 4);

        accountMap.add("Matti", 1);
        accountMap.add("Matti", 2);

        accountMap.print();
    }
}
