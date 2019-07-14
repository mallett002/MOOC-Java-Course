package week7.Library;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public String toString() {
        return "The book is " + this.getName();
    }
}
