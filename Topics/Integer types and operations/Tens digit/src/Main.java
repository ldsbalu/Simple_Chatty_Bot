import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int place = 0;


        if (a <= 10000000 && a >= 0){


            place = (a/10)%10;  

            System.out.println(place);


        }
    }
}
