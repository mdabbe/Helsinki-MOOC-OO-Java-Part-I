import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int n = reader.nextInt();
        System.out.println("Factorial is " + factorial(n));

    }
    public static int factorial(int n) {
        if(n==0)
            return 1;
        return n * (factorial(n-1));
    }
}
