package week8.Book;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Book objectBook = new Book("ObjectBook", 2000);
//        System.out.println(objectBook);

        // Equals method:-----------------------------------------------------------------------------------------------
//        Book anotherBook = objectBook;
//
//        checkIfEqual(objectBook, anotherBook);
//
//        anotherBook = new Book("ObjectBook", 2000);
//
//        checkIfEqual(objectBook, anotherBook);

        // Equals and ArrayList (contains())----------------------------------------------------------------------------
//        ArrayList<Book> books = new ArrayList<>();
//        Book greatGatsby = new Book("The Great Gatsby", 1952);
//        books.add(greatGatsby);
//
//        if (books.contains(greatGatsby)) {
//            System.out.println("The book was found");
//        }
//
//        greatGatsby = new Book("The Great Gatsby", 1952);
//
//        if (!books.contains(greatGatsby)) {
//            System.out.println("Book not found");
//        }

        // HashCode method----------------------------------------------------------------------------------------------
        HashMap<Book, String> loaners = new HashMap<>();

        Book objectBook = new Book("ObjectBook", 2000);
        loaners.put(objectBook, "Pekka");
        loaners.put(new Book("Test Driven Dev", 1999), "Arto");

        System.out.println(loaners.get(objectBook)); // Pekka
        System.out.println(loaners.get(new Book("ObjectBook", 2000))); // null
        System.out.println(loaners.get(new Book("Test Driven Dev", 1999))); // null
        // Diff objects with same content receive diff hashCode method outputs
    }

    public static void checkIfEqual(Object objOne, Object objTwo) {
        if (objOne.equals(objTwo)) {
            System.out.println("The books were the same");
        } else {
            System.out.println("They're different");
        }
    }
}
