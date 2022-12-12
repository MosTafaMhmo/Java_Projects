import java.util.Scanner;

public class ncr_npr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = input.nextInt();
        System.out.print("Enter r value : ");
        int r = input.nextInt();
        int npr = fact(n) / fact(n - r);
        int ncr = fact(n) / (fact(n - r) * fact(r));
        System.out.println("npr = " + npr);
        System.out.println("ncr = " + ncr);
    }

    public static int fact(int N) {
        int f = 1;
        for (int i = 1; i <= N; i++) {
            f *= i;
        }
        return f;
    }

}
