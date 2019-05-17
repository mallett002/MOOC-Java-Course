package week5.Person;

public class WeightWatchersAssociation {
    private double lowestWeightIndex;

    public WeightWatchersAssociation(double indexLimit) {
        this.lowestWeightIndex = indexLimit;
    }

    public boolean isAcceptedAsMember(Person person) { // using object as param
        return person.weightIndex() >= this.lowestWeightIndex;
    }
}
