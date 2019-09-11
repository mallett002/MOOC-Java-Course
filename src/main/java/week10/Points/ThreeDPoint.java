package week10.Points;

// If a method is inherited, it will call it in the context of the sub-class

public class ThreeDPoint extends Point {
    private int z;

    public ThreeDPoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    protected String location() {
        return super.location() + ", " + z;
    }

    @Override
    public int manhattanDistanceFromOrigin() {
        return super.manhattanDistanceFromOrigin() + Math.abs(z);
    }

    // Can leave this toString() out since it's the same as super's toString().
    // location() in the toString will use sub-class's location().
    // manhattanDistanceFromOrigin() will call sub-class's.
//    @Override
//    public String toString() {
//        return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin();
//    }
}
