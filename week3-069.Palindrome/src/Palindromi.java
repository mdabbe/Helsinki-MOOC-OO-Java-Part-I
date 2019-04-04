import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        String help ="";
        for (int i=text.length(); i>0 ;i--)
            help = help + text.charAt(i-1);
        return help;
    }
    public static boolean palindrome(String text) {
        return  (reverse(text).equals(text));

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
