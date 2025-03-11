import java.util.Scanner;

public class Umferd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        int totalCells = n * m;
        int emptyCells = 0;

        for (int i = 0; i < m; i++) {
            String lane = scanner.nextLine();
            for (char cell : lane.toCharArray()) {
                if (cell == '.') {
                    emptyCells++;
                }
            }
        }

        double emptyRatio = (double) emptyCells / totalCells;

        System.out.printf("%.6f\n", emptyRatio);

    }
}
//FDASFJADSGFGY

