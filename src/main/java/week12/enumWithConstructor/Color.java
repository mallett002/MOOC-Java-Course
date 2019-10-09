package week12.enumWithConstructor;

public enum Color {
    // constructor parameters:
    RED("red"),
    GREEN("green"),
    BLUE("blue");

    private String name;

    // The constructor is private
    private Color(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
