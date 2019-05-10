package week5.OverloadedCounter;

public class Program {
    public static void main(String... args) {
        Counter counterWithCheck = new Counter(true);
        Counter counterWithNoCheck = new Counter(1);

        System.out.println("****The counter with check****");
        System.out.println(counterWithCheck);
        System.out.println("Decrease by 1");
        counterWithCheck.decrease();
        System.out.println(counterWithCheck);
        System.out.println("increasing by 4");
        counterWithCheck.increase(4);
        System.out.println( counterWithCheck);
        System.out.println("Attempting to decrease by 7");
        counterWithCheck.decrease(7);
        System.out.println(counterWithCheck);

        System.out.println(" ");

        System.out.println("****The counter with no check****");
        System.out.println(counterWithNoCheck);
        System.out.println("Decrease by 2");
        counterWithNoCheck.decrease(2);
        System.out.println(counterWithNoCheck);
        System.out.println("increasing by 6");
        counterWithNoCheck.increase(6);
        System.out.println(counterWithNoCheck);
        System.out.println("Attempting to decrease by 22");
        counterWithNoCheck.decrease(22);
        System.out.println(counterWithNoCheck);
    }
}
