import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Database db = new Database();

        while (true) {
            String userInput;
            System.out.print("?");
            userInput = reader.nextLine();
            if (userInput.equals("Quit")) {
                break;
            } else if (userInput.equals("Add")) {
                System.out.println("Name: ");
                String name = reader.nextLine();
                System.out.println("Latin Name: ");
                String latinName = reader.nextLine();
                db.add(name,latinName);
            } else if (userInput.equals("Observation")) {
                System.out.println("What was observed? ");
                String observed = reader.nextLine();
                db.observation(observed);
            } else if (userInput.equals("Statistics")) {
                db.statistics();
            } else if (userInput.equals("Show")) {
                System.out.println("What?");
                String query = reader.nextLine();
                db.show(query);
            }
        }
            
    }

}
