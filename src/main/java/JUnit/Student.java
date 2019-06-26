package JUnit;
import java.util.*;

public class Student {
    private String name;
    private String number;
    private Vector course_grades; // courses taken by student

    public Student(String nm, String no) throws RuntimeException {
        if (nm == null || no == null)
            throw new RuntimeException("Invalid inputs");

        name = nm;
        number = no;
        course_grades = new Vector();
    }

    public String getStuName() { return name; }

    public String getStuNumber() { return number; }

    public void assignGrade(String course, int score) throws RuntimeException {
        Course newCourse = new Course(course, score);
        course_grades.addElement(newCourse);
    }

    public int getGrade(String course) throws RuntimeException {
        if (course == null) {
            throw new RuntimeException("Invalid course name");
        }

        // find the course and return the grade
        for (Enumeration e = course_grades.elements(); e.hasMoreElements();) {
            Course c = (Course)e.nextElement();
            if (course.equals(c.getCourseName())) { // if entered course == current c.getCourseName()
                return c.getCourseGrade(); // give that one's grade
            }
        }
        // didn't find the course
        throw new RuntimeException("Course " + course + " does not exist");
    }
}
