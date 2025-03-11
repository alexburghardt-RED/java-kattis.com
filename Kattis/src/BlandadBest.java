import java.util.Scanner;

public class BlandadBest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        boolean hasBeef = false;
        boolean hasChicken = false;

        for (int i = 0; i < n; i++) {
            String meatType = scanner.nextLine().trim();
            if (meatType.equals("nautakjot")) {
                hasBeef = true;
            } else if (meatType.equals("kjuklingur")) {
                hasChicken = true;
            }
        }

        if (hasBeef && hasChicken) {
            System.out.println("blandad best");
        } else if (hasBeef) {
            System.out.println("nautakjot");
        } else if (hasChicken) {
            System.out.println("kjuklingur");
        }
    }
}