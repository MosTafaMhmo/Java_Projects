
import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columbs: ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the number at row= " + (i + 1) + " columb= " + (j + 1) + " : ");
                arr[i][j] = input.nextInt();
            }
        }
        int[][] tarr = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                tarr[i][j] = arr[j][i];
            }
        }
        System.out.println("The transposed matrix is : ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(tarr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
