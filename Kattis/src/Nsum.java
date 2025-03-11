import java.util.Scanner;

public class Nsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        String sum = input.nextLine();

        int spaceCount = 0;
        for (char c : sum.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        if (spaceCount == (n - 1)) {
            String[] tokens = sum.split(" ");
            int totalSum = 0;
            for (String token : tokens) {
                totalSum += Integer.parseInt(token);
            }
            System.out.println(totalSum);
        } else {
            System.out.println("Ungültige Eingabe!");
        }

    }
}