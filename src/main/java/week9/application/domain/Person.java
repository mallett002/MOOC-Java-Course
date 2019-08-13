package week9.application.domain;

public class Person implements Identifiable, Comparable<Identifiable> {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getPersonID() {
        return this.id;
    }

    @Override
    public String getID() {
        return getPersonID();
    }

    @Override
    public String toString(){
        return this.name + " ID: " +this.id;
    }

    @Override
    public int compareTo(Identifiable another) {
        return this.getID().compareTo(another.getID());
    }
}
