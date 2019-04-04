import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        Random gen = new Random();
        int count = 0;
        while (true) {

            int n = 1 + gen.nextInt(39);
            if (!containsNumber(n)) {
                this.numbers.add(n);
                count++;
            }
            if (count == 7)
                break;
        }




        }



    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
