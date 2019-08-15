package week9.Exceptions.Grade;

public class Main {
    public static void main(String... args) {
        Grade grade = new Grade(3);
        System.out.println(grade.getGrade());

        Grade wrongGrade = new Grade(22);
    }
}
