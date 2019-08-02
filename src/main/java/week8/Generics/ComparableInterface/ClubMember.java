package week8.Generics.ComparableInterface;


public class ClubMember implements Comparable<ClubMember> {
    private String name;
    private int height;

    public ClubMember(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    // Returns place order of clubMember compared to "This" one
    public int compareTo(ClubMember clubMember) {
        return this.height - clubMember.getHeight();
    }
}
