package week4.Person;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
        this.weight = 0;
        this.height = 0;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight( int newWeight) {
        this.weight = newWeight;
    }

    public double generateBodyMassIndex() {
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / (heightDividedByHundred * heightDividedByHundred);
    }

    public void becomeOlder() {
        this.age++;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}
