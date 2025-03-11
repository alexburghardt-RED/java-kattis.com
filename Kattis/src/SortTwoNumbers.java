import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        //Eingabe splitten
        String[] tokens = input.split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        try {
            //Zahlen in die Liste einfügen
            for (String token : tokens) {
                if (!token.isEmpty()) { //Leere Strings ignorieren
                    list.add(Integer.parseInt(token));
                }
            }

            //Zahlen sortieren
            Collections.sort(list);

            //Sortierte Zahlen ausgeben
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {
                    System.out.print(" "); //Leerzeichen zwischen den Zahlen
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}