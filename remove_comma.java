import java.lang.String;
import java.util.Scanner;

public class remove_comma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the srting : ");
        String str = input.nextLine();
        System.out.print("After removing   : ");
        int l = str.length();
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) != ',') {
                System.out.print(str.charAt(i));
            }
        }
    }
}
