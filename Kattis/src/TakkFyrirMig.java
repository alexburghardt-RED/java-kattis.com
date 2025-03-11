import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakkFyrirMig {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);

        do {
            n = scan.nextInt();
            scan.nextLine();
        } while (n < 1 || n > 1000);

        // Liste zum Speichern der Nachrichten
        List<String> messages = new ArrayList<>();

        // Einlesen der Namen und Erstellen der Nachrichten
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            messages.add("Takk " + name);
        }

        // Alle Nachrichten auf einmal ausgeben
        for (String message : messages) {
            System.out.println(message);
        }
    }
}