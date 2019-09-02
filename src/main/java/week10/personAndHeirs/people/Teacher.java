package week10.personAndHeirs.people;

public class Teacher extends Person {
    int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public String toString() {
        return super.toString() + "\n" + "  salary: " + this.getSalary() + " euros/month";
    }
}
