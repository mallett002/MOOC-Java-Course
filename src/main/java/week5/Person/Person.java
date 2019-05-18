package week5.Person;

import week5.Dates.MyDate;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private MyDate myBirthDate;

    public Person(String name) {
        this(name, 0); // calling second constructor
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.weight = 0;
        this.height = 0;
        this.myBirthDate = new MyDate(day, month, year);
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight( int newWeight) {
        this.weight = newWeight;
    }

    public double weightIndex() {
        if (getWeight() == 0 || getHeight() == 0) return (double) 0;
        double heightInMeters = getHeight() / 100.0;
        return (double) getWeight() / (heightInMeters*heightInMeters);
    }

    public boolean olderThan(Person compared) {
        return this.age > compared.age; // Private var accessed bc Person class contains the method
    }

    public void becomeOlder() {
        this.becomeOlder(1); // calls the other becomeOlder
    }

    // Overloaded
    public void becomeOlder(int years) {
        this.age = this.age + years;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

//    public String toString() {
//        return getName() + ", age " + getAge() + " years, body mass index is " + String.format("%.3f",weightIndex());
//    }

    public String toString() {
        return this.name + ", born " + this.myBirthDate; // calls toString of MyDate class
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}
