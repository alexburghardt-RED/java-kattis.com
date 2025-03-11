import java.util.Scanner;

public class Storafmaeli {
    public static void main(String[] args) {
        int nmin = 1;
        int nmax = 1000000;
        int n;

        Scanner scan = new Scanner(System.in);

        do {
            n = scan.nextInt();
        } while (n < nmin || n > nmax);

        // Reduziere den Bereich von n auf 1 bis 40
        int reducedN = (n - 1) % 40 + 1;

        if (reducedN == 10 || reducedN == 20 || reducedN == 30 || reducedN == 40) {
            System.out.print("Jebb");
        } else {
            System.out.print("Neibb");
        }
    }
}