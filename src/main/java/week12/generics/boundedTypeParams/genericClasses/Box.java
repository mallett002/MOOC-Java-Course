package week12.generics.boundedTypeParams.genericClasses;

// <T> specifies it takes a generic type
public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public static void main(String[] args) {
        // Make Box with <Integer> type
        Box<Integer> integerBox = new Box<Integer>();

        // Make Box with <String> type
        Box<String> stringBox = new Box<String>();

        integerBox.add(99);
        stringBox.add("barbecue chips");

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}
