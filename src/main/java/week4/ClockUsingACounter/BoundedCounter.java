package week4.ClockUsingACounter;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (this.value == upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString() { // Returns a string representation of the counter value
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value; // prepend it with "" to make it a string
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value > 0 && value <= this.upperLimit) {
            this.value = value;
        }
    }
}
