import java.util.Scanner;

public class Takkar {
    public static void main(String[] args) {
        int minab = 0;
        int maxab = 1000000000;

        int a;
        int b;

        Scanner scan  = new Scanner(System.in);

        do{
            a = scan.nextInt();
        }while (a < minab || a > maxab );

        do {
            b = scan.nextInt();
        }while (b < minab || b > maxab);

        if (a < b) {
            System.out.println("FAKE NEWS!");
        }
        if (a == b) {
            System.out.println("WORLD WAR 3!");
        }
        if (a > b) {
            System.out.println("MAGA!");
        }
    }
}