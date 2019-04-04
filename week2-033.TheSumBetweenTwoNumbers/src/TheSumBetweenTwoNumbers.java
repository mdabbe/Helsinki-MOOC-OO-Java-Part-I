
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int smaller = reader.nextInt();
        System.out.println("Last:");
        int bigger = reader.nextInt();
        int sum = 0;
        while (smaller <= bigger) {
            sum += smaller;
            smaller++;
        }
        System.out.println("The sum is " + sum);
        
    }
}
