import java.util.Scanner;

public class FramtidarFiFA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definiere die Wertebereiche
        int minn = 0;
        int maxn = 2 * 1000000000; // 2 * 10^9
        int mink = 1;
        int maxk = 1000;     // 10^3

        int inputn; //improvements
        int inputk; //improvements per year

        int frozenYear = 2022;

        // Eingabe des ersten Wertes im Bereich [0, 2 * 10^9]
        do { inputn = scanner.nextInt();

            if (inputn < minn || inputn > maxn) {
                System.out.println("Ungültiger Wert. Der Wert muss zwischen " + minn + " und " + maxn + " liegen.");
            }
        } while (inputn < minn || inputn > maxn);

        // Eingabe des zweiten Wertes im Bereich [1, 10^3]
        do { inputk = scanner.nextInt();

            if (inputk < mink || inputk > maxk) {
                System.out.println("Ungültiger Wert. Der Wert muss zwischen " + mink + " und " + maxk + " liegen.");
            }
        } while (inputk < mink || inputk > maxk);

        //Berechnung des aktuellen Jahres
        int currentYear = frozenYear + (inputn / inputk);
        System.out.println (currentYear);
    }
}