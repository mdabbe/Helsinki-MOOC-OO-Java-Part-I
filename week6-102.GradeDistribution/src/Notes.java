public class Notes {
    private int[] noteDis = new int[6];

    public Notes() {
        for (int i: noteDis)
            noteDis[i] = 0;
    }

    public void addNote(int note) {
        if (note<=29) {
            noteDis[0]++;
        } else if (note<=34) {
            noteDis[1]++;
        } else if (note<=39) {
            noteDis[2]++;
        } else if (note<=44) {
            noteDis[3]++;
        } else if (note<=49) {
            noteDis[4]++;
        } else if (note<=60) {
            noteDis[5]++;
        }
    }

    public double getAcceptance() {
        int accepted = 0;

        for (int i = 1; i < noteDis.length;i++)
            accepted += noteDis[i];
        int sum = accepted + noteDis[0];
        return 100 * (double)accepted / sum;
    }
    public void gradeDistrubition() {
        System.out.println("Grade distribution:");
        for (int i = noteDis.length - 1; i>=0; i--) {
            System.out.print(i + ": ");
            this.print(i);
            System.out.println();
        }
        System.out.println("Acceptance percentage: " + getAcceptance());

    }
    public void print(int n) {
        for (int i = 0; i<noteDis[n]; i++)
            System.out.print("*");
    }


}
