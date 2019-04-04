import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String userInput;
        do {
            System.out.println("Type a word:");
            userInput = reader.nextLine();
            words.add(userInput);
        } while (!userInput.isEmpty());
        Collections.reverse(words);
        System.out.println("You typed the following words: ");
        for (String word : words)
            System.out.println(word);
    }
}
