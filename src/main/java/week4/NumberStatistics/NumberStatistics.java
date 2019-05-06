package week4.NumberStatistics;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) { // adds new number to statistics
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() { // how many numbers have been added to statistics
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        }
        return (double) this.sum / this.amountOfNumbers;
    }
}
