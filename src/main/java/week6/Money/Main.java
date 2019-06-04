package week6.Money;

public class Main {
    public static void main(String... args) {
//        Money a = new Money(10,88);
//        Money b = new Money(5,31);
//        Money c = a.plus(b);
//        System.out.println(c);

//        Money a = new Money(10,0);
//        Money b = new Money(3,0);
//        Money c = new Money(5,0);
//
//        System.out.println(a.less(b));  // false
//        System.out.println(b.less(c));  // true

        Money a = new Money(10,0);
        Money b = new Money(6,50);

        Money c = a.minus(b);
        System.out.println(c);
    }
}
