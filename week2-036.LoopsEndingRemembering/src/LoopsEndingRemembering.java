import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
            int count = 0;
            int sum = 0;
            int even = 0;
            int odd = 0;
            System.out.println("Type numbers:");
        while (true) {
            int n = reader.nextInt();
            sum += n;
            count++;
            if (n%2==0) {
                even++;
            }
            if (n%2>0) {
                odd++;
            }
            if (n == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + (sum + 1));
                System.out.println("How many numbers: " + (count - 1));
                System.out.println("Average: " + ((1.0 * (sum + 1)) / (count - 1)));
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            }
        }
    }
}
