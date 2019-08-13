package week9.moving.domain;

import java.util.ArrayList;

public class Box implements Thing {
    private int maximumCapacity;
    private ArrayList<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        things = new ArrayList<>();
    }

    public int getVolume() {
        // loop over things and return sum volume
        int sum = 0;

        for (Thing thing : things) {
            sum += thing.getVolume();
        }

        return sum;
    }

    public boolean addThing(Thing newThing) {
        boolean fitsInBox = newThing.getVolume() + getVolume() < maximumCapacity;

        if (fitsInBox) {
            things.add(newThing);
            return true;
        }

        return false;
    }
}
