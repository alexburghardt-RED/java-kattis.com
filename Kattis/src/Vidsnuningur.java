import java.util.Scanner;

public class Vidsnuningur{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String letters = scan.nextLine();

        String reversedletters = new StringBuilder(letters).reverse().toString();

        System.out.println(reversedletters);
    }
}