import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
