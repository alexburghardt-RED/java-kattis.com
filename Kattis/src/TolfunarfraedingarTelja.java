import java.util.Scanner;

public class TolfunarfraedingarTelja {
    public static void main(String[] args) {
        int mina = 1;
        int maxa = 1000000000;
        int a;

        Scanner scan = new Scanner(System.in);

        do {
            a = scan.nextInt();
            if (a < mina || a > maxa) {                 //Prüft die Bedingung und falls diese zutrifft,
                System.out.println("Invalid input");    //wird der Text ausgegeben
            }
        } while (a < mina || a > maxa);                 //Wenn die Bedingung zutriff, wird Schleife wiederholt

        int n = a - 1;
        System.out.println(n);
    }
}
