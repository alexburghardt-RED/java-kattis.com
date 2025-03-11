import java.util.Scanner;

public class JackOLantern {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int t = scanner.nextInt();
    int m = scanner.nextInt();

    int possibleVariations = (n * t * m);
    System.out.println(possibleVariations);
    }
}