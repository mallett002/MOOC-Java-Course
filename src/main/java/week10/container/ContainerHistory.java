package week10.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public String toString() {
        return history.toString();
    }
}
