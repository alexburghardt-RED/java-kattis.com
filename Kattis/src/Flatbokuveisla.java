import java.util.Scanner;

public class Flatbokuveisla {
    public static void main(String[] args) {
        int minnm = 1;
        int maxnm = 1000000;

        int n;
        int m;

        Scanner scan = new Scanner(System.in);

        do {
            n = scan.nextInt();
            //if (n < minnm || n > maxnm ) {            //Das nur benötigt, wenn ein wirklicher Benutzer
               // System.out.println("Invalid Input");  //die Abfrage stellt
            //}
        }while (n < minnm || n > maxnm);

        do {
            m = scan.nextInt();
        }while (m < minnm || m > maxnm);

        int leftOverSlices = (n % m);
        System.out.println(leftOverSlices);
    }
}