import java.util.Scanner;

public class KikiBoba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        int anzahlK = 0;
        int anzahlB = 0;

        for (char c : word.toCharArray()) {
            if (c == 'k') {
                anzahlK++;
            } else if (c == 'b') {
                anzahlB++;
            }
        }

        if (anzahlK == anzahlB && anzahlB > 0 && anzahlK > 0) {
            System.out.println("boki");
        }
        if (anzahlK > anzahlB) {
            System.out.println("kiki");
        }
        if (anzahlK < anzahlB) {
            System.out.println("boba");
        }
        if (anzahlK == 0 && anzahlB == 0) {
            System.out.println("none");
        }

    }
}