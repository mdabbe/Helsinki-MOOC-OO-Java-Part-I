import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics sumOfEven = new NumberStatistics();
        NumberStatistics sumOfOdd = new NumberStatistics();

        int n;
        System.out.println("Type numbers: ");
        while (true) {
            n = reader.nextInt();
            if (n == -1)
                break;
            sum.addNumber(n);
            if (n%2==0)
                sumOfEven.addNumber(n);
            if (n%2!=0)
                sumOfOdd.addNumber(n);
        }
        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + sumOfEven.sum());
        System.out.println("sum of odd: " + sumOfOdd.sum());

        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order

    }
}
