
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year:");
        int y = reader.nextInt();
        if (y%4==0) {
            if (!(y%100==0)){
                System.out.println("The year is a leap year.");
            } else if(y%100==0 && y%400==0) {
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not leap year.");
            }
        } else {
            System.out.println("The year is not leap year.");
        }
    }
}
