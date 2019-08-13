package week9.moving.logic;

import week9.moving.domain.Box;
import week9.moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;
    private List<Box> boxes;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(boxesVolume);

        for (Thing thing : things) {
            boolean wasAdded = box.addThing(thing);

            if (!wasAdded) {
                boxes.add(box);
                box = new Box(boxesVolume);
                box.addThing(thing);
            }
        }

        boxes.add(box);
        return boxes;
    }
}
