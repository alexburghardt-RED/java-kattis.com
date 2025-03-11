import java.util.Scanner;

public class Leynipjonusta {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String in = input.nextLine();
        String out = in.replace(" ","");
        System.out.println(out);
    }
}