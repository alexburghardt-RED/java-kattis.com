import java.util.Scanner;

public class Millifaersla {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a < b && a < c) {
            System.out.println("Monnei");
        }if (b < a && b < c) {
            System.out.println("Fjee");
        }if (c < a && c < b) {
            System.out.println("Dolladollabilljoll");
        }
    }
}