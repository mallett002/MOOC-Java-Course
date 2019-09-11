package week10.DifferentBoxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box {

    private List<Thing> things;

    public BlackHoleBox() {
        this.things = new ArrayList<>();
    }

    public void add(Thing thing) {
        this.things.add(thing);
    }

    public boolean isInTheBox(Thing newThing) {
        return false;
    }
}
