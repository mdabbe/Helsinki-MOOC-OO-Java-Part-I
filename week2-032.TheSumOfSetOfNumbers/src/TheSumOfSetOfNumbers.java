
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int n = reader.nextInt();
        int m = 1;
        while (n > 1) {
            m += n;
            n--;
        }
        System.out.println("Sum is " + m);

    }
}
