package week9.Printer;

public class Main {
    public static void main(String... args) throws Exception {
        Printer printer = new Printer("C:\\bench\\MOOC\\src\\main\\java\\week9\\Printer\\raven.txt");

        printer.printLinesWhichContain("raven");
        System.out.println("");

        System.out.println("-----");
        printer.printLinesWhichContain("omnivorous");
        System.out.println("");

        System.out.println("-----");
        printer.printLinesWhichContain("");

        printer.closeReader();
    }
}
