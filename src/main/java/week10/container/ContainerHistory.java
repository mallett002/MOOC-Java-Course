package week10.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {
    List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public double maxValue() {
        return Collections.max(this.history);
    }

    public double minValue() {
        return Collections.min(this.history);
    }

    public double average() {
        if (this.history.size() > 0) {
            double sum = this.history.stream()
                    .reduce(0.0, Double::sum);

            // Other ways to sum with a stream:
//
//            double sum2 = this.history.stream()
//                    .collect(Collectors.summingDouble(Double::doubleValue));
//
//            double sum3 = this.history.stream()
//                    .mapToDouble(Double::doubleValue)
//                    .sum();

            return sum / this.history.size();
        }

        return 0;
    }

    public double greatestFluctuation() {
        double largestDistance = 0;

        if (this.history.size() > 1) {
            for (int i = 0; i < this.history.size() - 1; i++) {
                double currentFlux;
                double currentNum = this.history.get(i);
                double nextNum = this.history.get(i + 1);
                boolean oneIsNegative = currentNum < 0 && nextNum >= 0 || currentNum >= 0 && nextNum < 0;

                if (oneIsNegative) {
                    currentFlux = Math.abs(currentNum) + Math.abs(nextNum);
                } else {
                    currentFlux = Math.abs(currentNum) - Math.abs(nextNum);
                }

                if (Math.abs(currentFlux) > largestDistance) {
                    largestDistance = Math.abs(currentFlux);
                }
            }

            return largestDistance;
        }

        return 0;
    }

    public double variance() {
        double sum = 0;

        for (double num : this.history) {
            sum += Math.pow((num - average()), 2);
        }

        return sum / (this.history.size() - 1);
    }

    public String toString() {
        return history.toString();
    }
}
