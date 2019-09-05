package week10.container;

public class ProductContainer extends Container {
    private String productName;

    public ProductContainer(String name, double capacity) {
        super(capacity);
        this.productName = name;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public String getName() {
        return this.productName;
    }

    @Override
    public String toString() {
        return this.productName + ": " + super.toString();
    }
}
