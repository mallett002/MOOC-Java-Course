package week4.Product;

public class Main {
    public static void main(String... args) {
        Product banana = new Product("banana", .87, 4);
        Product apple = new Product("apple", 1.07, 4);
        Product tv = new Product("tv", 179.99, 1);

        banana.printProduct();
        apple.printProduct();
        tv.printProduct();
    }
}
