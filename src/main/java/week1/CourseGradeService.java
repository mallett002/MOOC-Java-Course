package week1;
import java.util.Scanner;

public class CourseGradeService {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int input = Integer.parseInt(reader.nextLine());

        final String template = "Your grade is ";

        if (input > 49) {
            System.out.println(template + 5);
        } else if (input < 50 && input > 46) {
            System.out.println(template + 4);
        } else {
            System.out.println(template + 3);
        }
    }

}
