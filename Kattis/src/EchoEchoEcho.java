import java.util.Scanner;

public class EchoEchoEcho {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String input = scan.nextLine();

        String echo = input;
        System.out.println(echo + " " + echo + " " + echo);
    }
}