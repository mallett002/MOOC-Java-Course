package week12.staffPersonnel;

public class Main {
    public static void main(String[] args) {
        Employees university = new Employees();
        university.add(new Person("Matti", Education.DOCTOR));
        university.add(new Person("Pekka", Education.GRADUATE));
        university.add(new Person("Arto", Education.DOCTOR));

        university.print();

        university.fire(Education.GRADUATE);

        System.out.println("==");

        university.print();
    }
}
