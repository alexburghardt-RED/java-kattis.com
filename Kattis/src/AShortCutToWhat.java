import java.util.Scanner;

public class AShortCutToWhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //int result = ((n + 5) * 3) - 10;
        int result = (3 * n + 15) - 10;
        System.out.println(result);
    }
}