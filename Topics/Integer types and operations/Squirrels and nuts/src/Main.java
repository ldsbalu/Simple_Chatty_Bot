import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int noOfSquirrels = s.nextInt();
        int noOfNuts = s.nextInt();
        //int remainder = noOfNuts % noOfSquirrels;
        int r = Math.floorMod(noOfNuts,noOfSquirrels);
        System.out.println(r);
    }
}