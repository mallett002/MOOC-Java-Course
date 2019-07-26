package week8.Generics.Slot;

// Slot can be assigned whatever object
public class Slot<T> {
    // key will be whatever type "T" the constructor is called with
    // Ex: Slot<Integer> num = new Slot<>(); key will be int
    private T key;

    public void setValue(T key) {
        this.key = key;
    }

    public T getValue() {
        return key;
    }
}
