package week4.Person;

public class Main {
    public static void main(String[] args) {
        Person bob = new Person("Bob");
        Person andy = new Person("Andy");

        int i = 0;
        while (i < 30) {
            bob.becomeOlder();
            i++;
        }

        andy.becomeOlder();

        if (andy.isAdult()) {
            System.out.println(andy.getName() + " is an adult");
        } else {
            System.out.println(andy.getName() + " is a minor");
        }

        if ( bob.isAdult() ) {
            System.out.println( bob.getName() + " is an adult" );
        } else {
            System.out.println( bob.getName() + " is a minor" );
        }

        bob.printPerson();

        // Calling Person.toString method
        System.out.println(andy); // java calls it as "System.out.println(andy.toString()); during runtime
        System.out.println(bob);

        // Generating bodyMassIndex---------
        Person will = new Person("Will");
        Person marcela = new Person("Marcela");

        will.setHeight(180);
        will.setWeight(86);

        marcela.setHeight(175);
        marcela.setWeight(64);

        System.out.println(will.getName() + ", body mass index: " + will.generateBodyMassIndex());
        System.out.println(marcela.getName() + ", body mass index: " + marcela.generateBodyMassIndex());
    }
}
