package week9.Exceptions.Grade;

public class Grade {
    private int grade;

    public Grade(int grade) {
        boolean isGradeValid = grade < 0 || grade > 5;

        if (!isGradeValid) {
            throw new IllegalArgumentException("The grade has to be between 0-5");
        }

        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }
}
