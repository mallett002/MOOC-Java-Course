package week10.container;

public class Main {
    public static void main(String[] args) {
        ProductContainer juice = new ProductContainer("Juice", 1000.0);
        juice.addToTheContainer(1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName());
        juice.addToTheContainer(1.0);
        System.out.println(juice);

//        Exercise 30.6: Product Container Recorder, Phase 1
    }
}
