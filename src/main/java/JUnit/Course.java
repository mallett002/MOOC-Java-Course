package JUnit;

public class Course {
    String course_name;
    int grade;

    public Course(String nm, int gr) throws RuntimeException {
        if (nm == null || nm.equals("") || gr < 0 || gr > 100)
            throw new RuntimeException("Illegal inputs for Coruse");

        course_name = nm;
        grade = gr;
    }

    public String getCourseName() {
        return course_name;
    }

    public int getCourseGrade() {
        return grade;
    }
}
