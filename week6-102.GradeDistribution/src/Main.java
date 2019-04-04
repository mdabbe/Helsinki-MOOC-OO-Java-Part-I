import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Notes notes = new Notes();
//        notes.addNote(34);
//        notes.addNote(41);
//        notes.addNote(53);
//        notes.addNote(36);
//        notes.addNote(55);
//        notes.addNote(27);
//        notes.addNote(43);
//        notes.addNote(40);
        System.out.println("Type exam scores, -1 completes: ");

        while (true) {
            int note = reader.nextInt();
            if (note == -1)
                break;
            if (!(note>60 || note<0))
                notes.addNote(note);
        }

        notes.gradeDistrubition();


    }
}
