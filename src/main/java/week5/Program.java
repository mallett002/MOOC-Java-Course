package week5;

public class Program {
    public static void main(String... args) {
        Person john = new Person("John", 24);
        Person pete = new Person("Pete");

        // set their weight and height
        john.setHeight(55);
        john.setWeight(106);
        pete.setHeight(89);
        pete.setWeight(145);

        System.out.println(john);
        System.out.println(pete);
    }
}
