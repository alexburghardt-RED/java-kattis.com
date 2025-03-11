import java.util.Scanner;

public class LeggjaSaman {
    public static void main(String[] args) {
        int n;
        int m;
        int result;

        Scanner scan = new Scanner(System.in);

        do {
            n = scan.nextInt();
        }while (n < 2 || n > 1000);

        do {
            m = scan.nextInt();
        }while (m < 2 || m > 1000);

        result = n + m;
        System.out.println(result);
    }
}