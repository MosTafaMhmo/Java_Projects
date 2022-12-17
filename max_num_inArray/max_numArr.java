
import java.util.Scanner;

public class max_numArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value " + (i + 1));
            arr[i] = input.nextInt();
            mx = Math.max(mx, arr[i]);
        }
        System.out.println("the maximum number is = " + mx);
    }
}