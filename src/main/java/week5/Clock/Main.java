package week5.Clock;

public class Main {
    public static void main(String... args) {
        Clock clock = new Clock(23, 59, 50);

        for (int i = 0; i < 20; i++) {
            System.out.println(clock);
            clock.tick();
        }
    }
}
