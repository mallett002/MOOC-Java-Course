package week8.Factory;

public class Book implements ToBeStored, Item {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public double weight() { return this.weight; }
    public String getWriter() { return this.writer; }
    public String getName() { return this.name; }

    public String toString() {
        return this.getWriter() + ": " + this.getName();
    }
}
