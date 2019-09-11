package week10.DifferentBoxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight can't be negative");
        } else {
            this.weight = weight;
            this.name = name;
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object object) {
        boolean objectNullOrDifferentClass = object == null || this.getClass() != object.getClass();

        if (objectNullOrDifferentClass){
            return false;
        }

        Thing thing = (Thing) object;

        if (this.name == null || !this.name.equals(thing.name)){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.name == null) {
            return 7;
        }

        return this.name.hashCode();
    }
}
