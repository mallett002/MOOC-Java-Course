package week12.generics.genericMethods;

// Generic Methods
// Has a type parameter < E > for use inside method for generic types
public class GenericMethodTest {
    // < E > is type parameter: Tells us it is generic type method
    public static < E > void printArray( E[] inputArray) { // takes in type "E"
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Make diff type arrays
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        // Call print array for each type
        System.out.println("Array integerArray contains:");
        printArray(intArray);

        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);

        System.out.println("Array charArray contains:");
        printArray(charArray);
    }
}
