import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int stars = 0;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density) {
        this(density,20,10);
    }

    public NightSky(int width, int height) {
        this(0.1,width,height);
    }

    public void printLine() {
        Random random = new Random();
        for (int i=0;i<this.width;i++) {
            double p = random.nextDouble();
            if (p>this.density) {
                System.out.print(" ");
            } else {
                System.out.print("*");
                stars++;
            }
        }
    }

    public void print() {
        this.stars=0;
        for (int i=0;i<this.height;i++) {
            printLine();
        }
        System.out.println();
    }

    public int starsInLastPrint(){
        return stars;
    }

}
