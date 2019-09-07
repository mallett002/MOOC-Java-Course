package week10.farmSim;

public class Main {
    public static void main(String... args) {
        MilkingRobot milkingRobot = new MilkingRobot();
        Cow cow = new Cow();
        BulkTank tank = new BulkTank();
        milkingRobot.setBulkTank(tank);
        System.out.println("Bulk tank: " + milkingRobot.getBulkTank());

        for (int i = 0; i < 2; i++) {
            System.out.println(cow); // name amount/capacity
            System.out.println("Living..");
            for(int j = 0; j < 5; j++) {
                cow.liveHour(); // do 5 milking sessions
            }
            System.out.println(cow); // name amount/capacity
        }

        System.out.println("Milking...");
        milkingRobot.milk(cow);
        System.out.println("Bulk tank: " + tank);
    }
}
