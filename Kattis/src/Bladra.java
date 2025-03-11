import java.util.Scanner;

public class Bladra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String werte = input.nextLine();
        String[] teile = werte.split(" ");

        if (teile.length != 3) {
            System.out.println("Fehler");
            return;
        }

        try {
            int v = Integer.parseInt(teile[0]);
            int a = Integer.parseInt(teile[1]);
            int t = Integer.parseInt(teile[2]);
            double s = (v * t) + (0.5 * a * t * t);
            System.out.println(s);
        }catch (Exception e) {
            System.out.println("Fehler");
        }
    }
}