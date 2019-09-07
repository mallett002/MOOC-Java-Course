package week10.farmSim;

import java.util.LinkedList;

public class Main {
    public static void main(String... args) {
        Barn barn = new Barn(new BulkTank());
        System.out.println(barn);

        MilkingRobot robot = new MilkingRobot();
        barn.installMilkingRobot(robot);

        Cow ammu = new Cow("Ammu");
        ammu.liveHour();
        ammu.liveHour();

        barn.takeCareOf(ammu);
        System.out.println(barn);

        LinkedList<Cow> cowList = new LinkedList<>();
        cowList.add(ammu);
        cowList.add(new Cow());

        cowList.forEach(Cow::liveHour);

        barn.takeCareOf(cowList);
        System.out.println(barn);

//        Exercise 31.5: Farm
    }
}
