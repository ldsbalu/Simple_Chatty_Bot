import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean d = a >= b && a <= c || a <= b && a >= c;

        System.out.println(d);
    }
}
