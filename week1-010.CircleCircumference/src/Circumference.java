
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius:");
        double r = reader.nextInt();
        System.out.println("Circumference of the circle:" + r *(2*Math.PI));
    }
}
