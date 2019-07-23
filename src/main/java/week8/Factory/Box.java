package week8.Factory;

import java.util.ArrayList;

public class Box {
    private double maxWeight;
    private ArrayList<ToBeStored> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public double weight() {
        double weight = 0.0;
        for (ToBeStored item : items) {
            weight += item.weight();
        }

        return weight;
    }

    public void add(ToBeStored newItem) {
        boolean canBeAdded = newItem.weight() + weight() < maxWeight;
        if (canBeAdded) {
            items.add(newItem);
        }
    }

    public String toString() {
        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
}
