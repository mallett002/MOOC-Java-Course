package week4.Product;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void printProduct() {
        System.out.println(this.name + ", price: " + this.price + ", amount: " + this.amount);
    }
}
