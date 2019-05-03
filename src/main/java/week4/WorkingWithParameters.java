package week4;

import java.util.ArrayList;
// Primitive data types (int, double, char, boolean) get copied in method parameter.
// Other types, like ArrayList, the reference to the actual variable is copied

public class WorkingWithParameters {
    public static void main(String[] args) {
        // For addThree method
        int number = 1;
        number = addThree(number); // 1 + 3
        System.out.println(number); // 4

        // For removeFirst method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.add(3);

        System.out.println(numbers); // [4, 3, 7, 3]
        removeFirst(numbers);
        System.out.println(numbers); // [3, 7, 3]
    }

    public static int addThree(int value) { // value is a copy of "number"
        return value + 3; // returns a new "value" to be captured by variable
    }

    public static void removeFirst(ArrayList<Integer> list) { // method gets original arrayList
        // take the given list, numbers in this case, and change it
        list.remove(0); // changes original list
    }
}
