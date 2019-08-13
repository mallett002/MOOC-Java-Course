package week9.application.domain;

public class Main {
    public static void main(String... args) {
        Register personnel = new Register();
        personnel.add(new Person("Will", "221078-123X"));
        personnel.add(new Person("Marcela", "110956-326B"));

        System.out.println(personnel.get("280283-111A")); // null

        Person found = (Person) personnel.get("110956-326B"); // Cast to Person bc returns an "Identifiable"
        System.out.println(found.getName()); // Needs to be a person to use getName()
    }
}
