package week7.Library;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> collection;

    public Library() {
        this.collection = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = stringCleaner(book.getName());

        if (this.collection.containsKey(name)) {
            System.out.println("The book is already in the library!");
        } else {
            this.collection.put(name, book);
        }
    }

    public void removeBook(String bookName) {
        bookName = stringCleaner(bookName);

        if (this.collection.containsKey(bookName)) {
            this.collection.remove(bookName);
        } else {
            System.out.println("The book was not found. You can't remove it!");
        }
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public Book getBook(String bookName) {
        bookName = stringCleaner(bookName);
        return this.collection.get(bookName);
    }

    // Using keySet() method: Returns set of keys that can be looped
    public Book getBookUsingItsBeginningCharacters(String beginning) {
        beginning = stringCleaner(beginning);

        for (String key : this.collection.keySet()) {
            if (key.startsWith(beginning)) {
                return this.collection.get(key);
            }
        }

        return null;
    }

    // Uses HashList's values() method
    public ArrayList<Book> bookList(){
        // values() returns set to be passed into ArrayList constructor
        return new ArrayList<Book>(this.collection.values());
    }
}