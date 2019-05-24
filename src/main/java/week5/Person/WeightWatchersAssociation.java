package week5.Person;

import java.util.ArrayList;

public class WeightWatchersAssociation {
    private double lowestWeightIndex;
    private String name;
    private ArrayList<Person> members;

    public WeightWatchersAssociation(String name, double indexLimit) {
        this.lowestWeightIndex = indexLimit;
        this.name = name;
        this.members = new ArrayList<>();
    }

    public boolean isAccepted(Person person) {
        return person.weightIndex() >= this.lowestWeightIndex;
    }

    public void addAsMember(Person person) {
        if (isAccepted(person)) {
            this.members.add(person);
        }
    }

    public Person personWithHighestWeightIndex() {
        if (this.members.isEmpty()) {
            return null;
        }

        Person heaviestSoFar = this.members.get(0);

        for (Person person : this.members) {
            if (person.weightIndex() > heaviestSoFar.weightIndex()) {
                heaviestSoFar = person;
            }
        }
        return heaviestSoFar;
    }

    public String toString() {
        String membersAsString = "";

        for (Person member : this.members) { // loop over this.members and append them to membersAsString
            membersAsString += " " + member.getName() + "\n";
        }

        return "Weightwatchers association " + this.name + " members: \n" + membersAsString;
    }

}
