import java.lang.String;
import java.util.Scanner;

public class ascii_l1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the ASCII code : ");
        int asc = input.nextInt();
        char c = (char) asc;
        System.out.println("The character is : " + c);
    }
}
