package week10.DifferentBoxes;

public class OneThingBox extends Box {

    private Thing thing;

    public void add(Thing thing) {
        if (this.thing == null) {
            this.thing = thing;
        }
    }

    public boolean isInTheBox(Thing newThing) {
        return this.thing.equals(newThing);
    }
}
