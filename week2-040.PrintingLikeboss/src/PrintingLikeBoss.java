public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        int n = 1;
        int e = size;
        while(n <= size) {
            printWhitespaces((e - n));
            printStars(n);
            n++;
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        int n = 1;
        int e = height;
        int nn = 0;
        while(n <= height) {
            printWhitespaces((e - n));
            nn = 1 + (2 * (n-1));
            if(n==1) {
                printStars(n);
            } else printStars(nn);
            n++;
        }
        int b = height -2;
        for (int i = 0; i<2; i++){
            printWhitespaces(b);
            printStars(3);
    }


        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
