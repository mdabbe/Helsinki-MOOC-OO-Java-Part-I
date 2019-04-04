
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String userInput;
        while (true) {
            System.out.println("Type a word:");
            userInput = reader.nextLine();
            if (words.contains(userInput))
                break;
            words.add(userInput);

        }
        System.out.println("You gave the word " + userInput + " twice");

        
    }
}
