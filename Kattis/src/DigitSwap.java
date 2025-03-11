import java.util.Scanner;

public class DigitSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();

        int tens = code / 10;
        int units = code % 10;

        int swappedCode = units * 10 + tens;

        System.out.println(swappedCode);
    }
}