import java.util.Scanner;

public class Kvedja {
    public static void main (String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);

        do {
        input =scan.nextLine();
        }while (input.length() < 1 || input.length() > 100 || !input.matches("[a-zA-Z]+"));

        System.out.println("Kvedja,");
        System.out.println(input);
    }
}