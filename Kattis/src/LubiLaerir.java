import java.util.Scanner;

public class LubiLaerir {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String wordinput = scan.nextLine();

        if (!wordinput.isEmpty()) {
            char firstChar = wordinput.charAt(0); //Diese Methode gibt das Zeichen an der Pos. 0 des String zurück
            System.out.println(firstChar);
        }
    }
}