import java.util.Scanner;

public class Dagatal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month = scan.nextInt();
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println(daysInMonth[month]);
    }
}