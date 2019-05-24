package week5.CounterClone;

public class Counter {
    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public void grow() {
        this.value++;
    }

    public String toString() {
        return "value: " + value;
    }

    public Counter clone() {
        // Creates new Counter with initial value of this one's current value
        return new Counter(this.value);
    }
}
