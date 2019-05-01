package week3;

public class Least {
    public static int least(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
    }

    public static double average(int n1, int n2, int n3, int n4) {
        int sum = n1 + n2 + n3 + n4;
        return (double) sum / 4;
    }

    public static void main(String... args) {
        int answer1 = least(2, 7);
        int answer2 = least(3, 3);
        System.out.println("Least: " + answer1);
        System.out.println("Least: " + answer2);
        System.out.println(average(1, 3, 4, 6));
    }
}
