
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Type a number: ");
        int a = reader.nextInt();
        System.out.println("Type another number: ");
        int b = reader.nextInt();
        int sum = a + b;
        System.out.println("Sum of the numbers: " + sum);


    }
}
