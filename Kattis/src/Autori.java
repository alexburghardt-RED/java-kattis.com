import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Eingabe einlesen
        String input = scan.nextLine();

        // Eingabe splitten
        String[] tokens = input.split("-");

        // Für jedes Token den ersten Buchstaben ausgeben
        for (String token : tokens) {
            if (!token.isEmpty()) {
                char firstChar = token.charAt(0);
                System.out.print(firstChar);
            }
        }
    }
}