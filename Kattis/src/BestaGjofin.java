import java.util.Scanner;

public class BestaGjofin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        String bestname = "";
        int highestscore = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String input = in.nextLine();

            String[] parts = input.split(" ");
            String name = parts[0];
            int score = Integer.parseInt(parts[1]);

            if (score > highestscore) {
                highestscore = score;
                bestname = name;
            }
        }
        System.out.println(bestname);

    }
}