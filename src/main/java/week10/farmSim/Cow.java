package week10.farmSim;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cow implements Milkable, Alive {
    // Specific to this cow
    private final String cowName;
    private final double udderCapacity;
    private double milkAmount;

    // Utils
    private final int UDDER_MIN = 15;
    private final int UDDER_MAX = 40;
    private final Random random = new Random();
    private static final String[] NAMES = new String[] {
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };

    public Cow() {
        this.cowName = NAMES[random.nextInt(this.NAMES.length)];
        this.udderCapacity = this.UDDER_MIN + random.nextInt(UDDER_MAX - UDDER_MIN + 1);
        this.milkAmount = 0;
    }

    public Cow(String name) {
        this.cowName = name;
        this.udderCapacity = this.UDDER_MIN + random.nextInt(UDDER_MAX - UDDER_MIN + 1);
        this.milkAmount = 0;
    }

    public String getName() { return this.cowName; }

    public double getCapacity() { return this.udderCapacity; }

    public double getAmount() { return this.milkAmount; }

    // Milk the cow
    @Override
    public void liveHour() {
        // produces between 0.7 - 2.0 li milk/hr
        double milkSession = ThreadLocalRandom.current().nextDouble(0.7, 2.0);
        double possibleNewMilkAmount = milkSession + this.milkAmount;

        if (possibleNewMilkAmount <= udderCapacity) {
            this.milkAmount = possibleNewMilkAmount;
        }
    }

    // take the milk to the milk factory
    @Override
    public double milk() {
        double amountToTake = this.milkAmount;
        this.milkAmount = 0;
        return amountToTake;
    }

    @Override
    public String toString() {
        return this.cowName + " " +
                String.format("%.2f", this.milkAmount) +
                "/" +
                String.format("%.2f", this.udderCapacity);
    }
}
