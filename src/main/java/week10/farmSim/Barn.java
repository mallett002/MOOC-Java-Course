package week10.farmSim;

import java.util.Collection;

// One milking robot
// milking robot connected to barn's bulk tank
// If barn has no milking robot, can't be used to handle cow
public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;

    // Barn comes with a tank
    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    // Have to get a milking robot separate, and install it
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        // installs a milking robot and connects it to the barn bulk tank
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.tank);
    }

    // Use robot to add cow's milk to the barn's tank
    public void takeCareOf(Cow cow) {
        if (this.robot == null) {
            throw new IllegalStateException("Milking robot has'nt been installed");
        } else {
            this.robot.milk(cow);
        }
    }

    // fill barn's tank with milk of many cows
    public void takeCareOf(Collection<Cow> cows) {
        // Collections.forEach method:
        cows.forEach(this::takeCareOf);
    }

    public String toString() {
        return "Barn: " +
                String.format("%.2f", this.tank.getVolume()) +
                "/" +
                String.format("%.2f", this.tank.getCapacity());
    }
}
