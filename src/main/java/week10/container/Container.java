package week10.container;

public class Container {
    private double capacity;
    private double volume;

    public Container(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }

        this.volume = 0;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getOriginalCapacity() {
        return this.capacity;
    }

    public double getCurrentCapacity() {
        return getOriginalCapacity() - getVolume();
    }

    public void addToTheContainer(double amount) {
        if (amount >= 0) {
            if (amount <= getCurrentCapacity()) {
                this.volume += amount;
            } else {
                this.volume = this.getOriginalCapacity();
            }
        }
    }

    public double takeFromTheContainer(double amount) {
        if (amount > 0) {
            if (amount > this.volume) {
                double amountToTake = this.volume;
                this.volume = 0;
                return amountToTake;
            } else {
                this.volume -= amount;
                return amount;
            }
        }

        return 0;
    }

    public String toString() {
        return "volume = " + getVolume() + ", free space " + getCurrentCapacity();
    }
}
