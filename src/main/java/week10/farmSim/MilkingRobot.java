package week10.farmSim;

public class MilkingRobot {
    BulkTank bulkTank;

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    public void setBulkTank(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public void milk(Milkable cow) {
        try {
            // add the milk from the cow to the bulk tank
            this.bulkTank.addToTank(cow.milk());
        } catch(Exception e) {
            throw new IllegalStateException("No bulk tank connected");
        }
    }
}
