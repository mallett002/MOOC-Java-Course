package week1;
import java.util.Scanner;

public class CalculateCircumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What's the radius of your circle?");
        int radius = Integer.parseInt(reader.nextLine());

        double circ = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is " + circ);
    }
}
