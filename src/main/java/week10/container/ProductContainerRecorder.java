package week10.container;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity); // call ProductContainer constructor with name and capacity
        this.history = new ContainerHistory();
        this.addToTheContainer(initialVolume);
        this.history.add(initialVolume);
    }

    public String history() {
        return this.history.toString();
    }
}
