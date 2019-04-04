
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]:");
        int g = reader.nextInt();
        if (g<=29) {
            System.out.println("failed");
        } else if (g>=30 && g<=34) {
            System.out.println("1");
        } else if (g>=35 && g<=39) {
            System.out.println("2");
        } else if (g>=40 && g<=44) {
            System.out.println("3");
        } else if (g>=45 && g<=49) {
            System.out.println("4");
        } else if (g>=50 && g<=60) {
            System.out.println("5");
        }


    }
}
