package week10.DifferentBoxes;

import java.util.Collection;

public abstract class Box {

    public abstract void add(Thing thing);

    public void add(Collection<Thing> things) {
        things.forEach(this::add);
    }

    public abstract boolean isInTheBox(Thing thing);
}
