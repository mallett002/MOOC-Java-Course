package week4.PasswordRandomizer;

public class Program {
    public static void main(String[] args) {
        PasswordRandomizer randomizer13 = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer13.createPassword());

        PasswordRandomizer randomizer5 = new PasswordRandomizer(5);
        System.out.println("Password: " + randomizer5.createPassword());
    }
}
