import java.util.Scanner;

public class Aleidibio {
    public static void main(String[] args) {
        int mina = 1;
        int maxa = 100;
        int minb = 1;
        int maxb = 100;
        int minc = 720;
        int maxc = 1439;

        int a;
        int b;
        int c;

         Scanner scan  = new Scanner(System.in);

         do {
             a = scan.nextInt();

             if (a < mina || a > maxa) {
                 System.out.println("invalid input");
             }
         }while (a < mina || a > maxa);

        do {
            b = scan.nextInt();

            if (b < minb || b > maxb) {
                System.out.println("invalid input");
            }
        }while (b < minb || b > maxb);

        do {
            c = scan.nextInt();

            if (c < minc || c > maxc) {
                System.out.println("invalid input");
            }
        }while (c < minc || c > maxc);

        int latestDrive = c - (a + b);
        System.out.println(latestDrive);
    }
}