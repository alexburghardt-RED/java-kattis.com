import java.text.DecimalFormat;
import java.util.Scanner;

public class Metronome {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        do {
            n = scan.nextInt();
        }while (n < 1 || n > 100000);

        double result = ((double) n/4);                       //hier drauf achten, dass durch die umformatierung auchn ein double steht
        DecimalFormat df = new DecimalFormat("0.00"); //gibt an dass auf 2 Stellen nach dem Komma gerundet wird.
        String decimalResult = df.format(result);
        System.out.printf(decimalResult);
    }
}