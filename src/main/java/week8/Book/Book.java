package week8.Book;

public class Book {
    private String name;
    private int publishingYear;

    public Book(String name, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    @Override
    // Compares if Book contents are the same
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        else if (this.getClass() != object.getClass()) { // if not even the same Class
            return false;
        }

        Book compared = (Book) object; // Only works if "object" is a Book
        // So now, there both Books...
        if (this.publishingYear != compared.getPublishingYear()) {
            return false;
        }
        else if (this.name == null || !this.name.equals(compared.getName())) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.publishingYear + ")";
    }

    public int hashCode() {
        if (this.name == null) {
            return 7;
        }

        return this.publishingYear + this.name.hashCode();
    }
}