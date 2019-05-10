package week5.OverloadedCounter;

public class Counter {
    private int value;
    private boolean checkIsOn;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.checkIsOn = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.increase(1);
    }

    public void increase(int amount) {
        if (amount > 0) {
            this.value += amount;
        }
    }

    public void decrease() {
        this.decrease(1);
    }

    public void decrease(int amount) {
        if (amount > 0) {
            if (this.checkIsOn) {
                if (this.value - amount >= 0) { // if subtraction leaves you with a number >= 0
                    this.value -= amount;
                } else { // otherwise it's below 0, so leave it at 0
                    this.value = 0;
                }
            } else {
                this.value -= amount;
            }
        }
    }

    public String toString() {
        return "Value: " + value();
    }
}
