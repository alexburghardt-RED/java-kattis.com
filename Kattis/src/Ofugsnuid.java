import java.util.Arrays;
import java.util.Scanner;

public class Ofugsnuid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            System.out.println(" ");
        }

    }
}