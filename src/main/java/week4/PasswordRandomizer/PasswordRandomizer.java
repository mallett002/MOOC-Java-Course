package week4.PasswordRandomizer;

import java.util.Random;

public class PasswordRandomizer {
    Random random;
    private int length;
    private String chars = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        this.random = new Random();
        this.length = length;
    }

    public String createPassword() {
        String password = "";

        for (int i = 0; i < this.length; i++) {
            int charsIndex = this.random.nextInt(this.chars.length());
            char nextLetter = this.chars.charAt(charsIndex);
            password += nextLetter;
        }

        return password;
    }
}
