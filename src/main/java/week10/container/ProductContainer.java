package week10.container;

public class ProductContainer extends Container {
    private String productName;

    public ProductContainer(String name, double capacity) {
        super(capacity);
        this.productName = name;
    }

    public String getName() {
        return this.productName;
    }
}
