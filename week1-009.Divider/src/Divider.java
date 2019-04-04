
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int x = reader.nextInt();
        System.out.println("Type another number: ");
        int y = reader.nextInt();
        double div = (double) x / y;
        System.out.println("Division: " + x + " / " + y + " = " + div);

        // Implement your program here. Remember to ask the input from user.
    }
}
