import java.util.Scanner;

public class HippHippHurra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        for (int i = 0; i < age; i++) {
            System.out.println("Hipp hipp hurra, " + name + "!");
        }
    }
}