import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //boolean to define week end or not
        boolean we = in.nextBoolean();

        //if weekend
        if(we == true) {
            //check if successful
            if(n>=15 && n<=25) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }

        //if not a week end
        else {
            //check if successful
            if(n>=10 && n<=20) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
    }
}


