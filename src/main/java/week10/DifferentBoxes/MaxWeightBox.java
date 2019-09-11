package week10.DifferentBoxes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public int getCurrentWeight() {
        return this.things.stream()
                .map(Thing::getWeight)
                .mapToInt(Integer::intValue).sum();
    }

    public void add(Thing thing) {
        int weightWithNewThing = thing.getWeight() + getCurrentWeight();

        if (weightWithNewThing <= this.maxWeight) {
            this.things.add(thing);
        } else {
            System.out.println("New thing will exceed weight limit");
        }
    }

    public boolean isInTheBox(Thing newThing) {
        for (Thing thing : things) {
            if (thing.equals(newThing)) {
                return true;
            }
        }

        return false;
    }
}
