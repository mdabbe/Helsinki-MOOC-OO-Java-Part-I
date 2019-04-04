import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String userTypedWrd = "";
        do {
            System.out.println("Type a word: ");
            userTypedWrd = reader.nextLine();
            words.add(userTypedWrd);
        } while (!userTypedWrd.isEmpty());
        System.out.println("You typed the following words:");
        for (String word : words)
            System.out.println(word);

    }
}
