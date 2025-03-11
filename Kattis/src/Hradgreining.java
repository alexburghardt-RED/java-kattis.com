import java.util.Scanner;

public class Hradgreining {
    public static void main(String[] args) {
        String dna;

        Scanner scan = new Scanner(System.in);

        dna = scan.next();

        if (dna.contains("COV")) {
            System.out.println("Veikur!");
        } else {
            System.out.println("Ekki veikur!");
        }
    }
}