package week10.farmSim;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<>();
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public String getOwner() {
        return this.owner;
    }

    @Override
    public void liveHour() {
        // call liveHour for each cow
        this.cows.forEach(Cow::liveHour);
    }

    public void manageCows() {
        // adds cows milk to barn's bulk tank
        this.barn.takeCareOf(this.cows);
    }

    public String animals() {
        if (this.cows.size() == 0) {
            return "No cows";
        }

        return this.cows.stream()
                .map(Cow::toString)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public String toString() {
        return "Farm owner: " + this.owner + "\n" +
                "Barn bulk tank: " + this.barn.getBulkTank() + "\n" +
                "Animals:\n" + this.animals();
    }
}
