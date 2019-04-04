import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random gen;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.gen = new Random();
    }

    public String createPassword() {
        String password = "";
        for (int i=0;i<length;i++) {
            int number = gen.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password += symbol;
        }
        return password;
    }
}
