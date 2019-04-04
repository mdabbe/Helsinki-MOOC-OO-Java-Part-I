
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        int limit = reader.nextInt();
        int count = 1;
        while (count <= limit) {
            System.out.println(count);
            count++;
        }
        
    }
}
