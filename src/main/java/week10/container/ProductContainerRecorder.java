package week10.container;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity); // call ProductContainer constructor with name and capacity
        this.history = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount); // add the amount to the container
        this.history.add(super.getVolume()); // update the history with new volume
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double amountTaken = super.takeFromTheContainer(amount); // take it
        this.history.add(super.getVolume()); // add volume to history
        return amountTaken; // return amount taken
    }

    public void printAnalysis() {
        System.out.println(
                "Product: " + super.getName() + "\n" +
                "History: " + this.history() + "\n" +
                "Greatest: " + this.history.maxValue() + "\n" +
                "Smallest: " + this.history.minValue() + "\n" +
                "Average: " + String.format("%.2f", this.history.average()) + "\n" +
                "Greatest Change: " + String.format("%.2f", this.history.greatestFluctuation()) + "\n" +
                "Variance: " + String.format("%.2f", this.history.variance())
        );
    }
}
