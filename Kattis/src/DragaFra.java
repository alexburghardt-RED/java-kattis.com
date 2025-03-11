import java.util.Scanner;

public class DragaFra {
    public static void main (String[] args) {
        int nmin = 1;
        int nmax = 10000;
        int mmin = 1;
        int mmax = 10000;

        int n;
        int m;

        Scanner scan = new Scanner(System.in);

        do {
            n = scan.nextInt();
        }while (n < nmin || n > nmax);

        do {
            m = scan.nextInt();
        }while ((m < 0 || m > mmax) || m > n);

        int numberOfCurtains = n - m;
        System.out.println(numberOfCurtains);
    }
}