
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int n = reader.nextInt();
        int count = 1;
        int result = 1;
        while (count <= n) {
            result += (int)Math.pow(2, count);
            count++;
        }
        System.out.println("The result is " + result);

    }
}
