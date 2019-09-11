package week10.farmSim;

// Stores milk
// Standard capacity of 2000 li, and customer specific capacity
public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (amount >= 0) {
            if (amount <= howMuchFreeSpace()) {
                this.volume += amount;
            } else {
                this.volume = capacity;
            }
        }
    }

    public double getFromTank(double amount) {
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

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
