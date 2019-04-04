
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess = 0;
        while (true) {
            System.out.println("Guess a number:");
            int n = reader.nextInt();
            guess++;
            if (n > numberDrawn) {
                System.out.println("The number is lesser, guesses made:" + guess);
            } else if (n < numberDrawn) {
                System.out.println("The number is greater, guesses made:" + guess);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
