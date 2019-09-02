package week10.basicInheritance;

public class Main {
    public static void main(String... args) {
        Motor motor = new Motor("combustion engine", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(motor.getMotorType()); // from subclass
        System.out.println(motor.getProducer()); // from super class
        System.out.println(motor);
    }
}
