package week12.RegularExpressions;

import java.util.Scanner;

public class BasicExpressions {
    public static void main(String[] args) {
//        intro();
//        verticalBar();
//        groups();
        repetitions();
    }

    public static void intro() {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Give the student number: ");
        String num = reader.nextLine();
        String regex = "01[0-9]{7}";

        if (num.matches(regex)) {
            System.out.printf("The form is valid");
        } else {
            System.out.printf("The form is not valid");
        }
    }

    public static void verticalBar() {
        String str = "00";

        if (str.matches("00|111|0000")) {
            System.out.println("The string was matched by some of the alternatives");
        } else {
            System.out.println("The string not was matched by any of the alternatives");
        }
    }

    public static void groups() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Write a form of the verb to look: ");
        String word = reader.nextLine();

        String regex = "look(|s|ed|ing|er)";

        if (word.matches(regex)) {
            System.out.println("Well done!");
        } else {
            System.out.printf("Nope");
        }
    }

    public static void repetitions() {
        // * is 0 or more times (star)
//        useStar();

        // + is 1 or more (plus)
//        usePlus();


        // ? is 0 or 1 (question)
//        useQuestionMark();

        // {n} is number of "n" times
//        useNTimes();

        // {a, b} is from a to b times
//        fromAToBTimes();

        // {n,} at least n times
//        atLeastNTimes();

        // multiple reps in one regex
        multiple();
    }

    public static void useStar() {
        String string = "trololololololo";
        String regex = "trolo(lo)*";

        if (string.matches(regex)) {
            System.out.println("The form is right!");
        } else {
            System.out.println("Wrong!");
        }
    }

    public static void usePlus() {
        String str = "trolololololo";
        String regex = "tro(lo)+"; // one or more times

        if (str.matches(regex)) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
    }

    public static void useQuestionMark() {
        String string = "You have accidentally the whole name";
        String regex = "You have accidentally (deleted )?the whole name"; // can have (deleted ) or not

        if (string.matches(regex)) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
    }

    public static void useNTimes() {
        String str = "1010";
        String regex = "(10){2}"; // 10 exactly 2 times

        if (str.matches(regex)) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
    }

    public static void fromAToBTimes() {
        String str = "1";
        String regex = "1{2,4}"; // "1" at least twice, up to four times

        if (str.matches(regex)) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
    }

    public static void atLeastNTimes() {
        String str = "1111";
        String regex = "1{2,}";

        if (str.matches(regex)) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
    }

    public static void multiple() {
        String str = "55501101000010111011555";
        // String that starts and ends with three fives with 0's and 1's in between
        String regex = "5{3}(0|1)*5{3}";

        if (str.matches(regex)) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
    }

    public static void squareBrackets() {

    }
}
