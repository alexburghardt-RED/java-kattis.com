import java.util.Scanner;

public class Reduplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s;
        byte nmin = 1;
        byte nmax = 9;
        byte n;

        do {
            s = scanner.nextLine();
        } while (s.length() < 2 || s.length() > 10 || !s.matches("[a-z]+"));
        //The condition inside s.matches("[a-z]")** is incorrect because "[a-z]"matches only a single lowercase letter.
        // You need"[a-z]+"` to match strings that consist of two or more lowercase letters.
        //Das + bedeutet, dass der String aus mindestens einem oder mehr Zeichen bestehen muss.
        //Das ! vor s.matches(...) negiert das Ergebnis.
        //Wenn der String also nicht nur aus kleinen Buchstaben besteht, wird die Bedingung wahr (true)
        //und die Schleife läuft weiter.

        do {
            n = scanner.nextByte();
        } while (n < nmin || n > nmax);

        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
    }
}