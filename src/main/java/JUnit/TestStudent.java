//package JUnit;
//
//import junit.framework.*;
//
//public class StudentTest extends TestCase {
//
//    // Assign name to represent the object being tested
//    public StudentTest(String name) {
//        super(name);
//    }
//
//    // method to test constructor of Student class
//    public void testConstructor() {
//        String student_name = "Jimmy";
//        String student_no = "946302B";
//
//        // Create new student
//        Student student = new Student(student_name, student_no);
//
//        // Verify that the object is constructed properly
//        assertEquals("Student name wrong", student_name, student.getStuName());
//        assertTrue("student no. wrong", student.getStuNumber().equals(student_no));
//
//        // Testing where exception is expected
//        // If no exception, test will fail (we're expecting exceptions here)
//        // Creating some illegal inputs:
//        try {
//            Student s = new Student("Jimmy", null);
//            fail("Constructor allows null student number"); // if no exception, all this "fail" method
//        } catch(RuntimeException e) {}
//
//        try {
//            Student s = new Student(null, "980921C");
//            fail("Constructor allows null student name");
//        } catch(RuntimeException e) {}
//    }
//
//    // Method to test assigning and retrieval of grades
//    public void testAssignAndRetrieveGrades() {
//        // Create a student
//        Student stu = new Student("Jimmy", "942682B");
//
//        // Assign some grades to this student
//        stu.assignGrade("cs2102", 60);
//        stu.assignGrade("cs2103", 70);
//        stu.assignGrade("cs2104", 80);
//
//        // Verify assignment is correct
//        assertTrue("fail to assign cs2102 grade", stu.getGrade("cs2102") == 60);
//        assertTrue("fail to assign cs2103 grade", stu.getGrade("cs2103") == 70);
//
//        // attempt to retrieve non-existing course
//        try {
//            stu.getGrade("cs21002");
//            fail("fail to catch non-existing course name");
//        } catch(RuntimeException e) {}
//    }
//
//    // method create a test suite
//    // To assemble all tests into a test suite
//    public static Test suite() {
//        return new TestSuite(Student.class);
//    }
//
//    // main method
//    public static void main(String... args) {
//        // invoke TestRunner for execution
//        junit.textui.TestRunner.run(suite());
//    }
//}
