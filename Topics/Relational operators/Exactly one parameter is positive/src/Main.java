import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int positiveCount = 0;
        if (x > 0) {
            positiveCount += 1;
        }
        if (y > 0) {
            positiveCount += 1;
        }
        if (z > 0) {
            positiveCount += 1;
        }

        if (positiveCount == 1) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }


    }
}