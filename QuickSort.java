import java.util.Scanner;

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int piv = low;
        while (low < high) {
            while (arr[piv] <= arr[high] && piv != high) {
                high--;
            }
            if (piv == high) {
                break;
            } else if (arr[piv] > arr[high]) {
                int temp = arr[high];
                arr[high] = arr[piv];
                arr[piv] = temp;
                piv = high;
            }
            while (arr[piv] >= arr[low] && piv != low) {
                low++;
            }
            if (piv == low) {
                break;
            } else if (arr[piv] < arr[low]) {
                int temp = arr[low];
                arr[low] = arr[piv];
                arr[piv] = temp;
                piv = low;
            }
        }
        return piv;
    }

    public static void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int piv = partition(arr, low, high);
            quick_sort(arr, low, piv - 1);
            quick_sort(arr, piv + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the value " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        quick_sort(arr, 0, N - 1);
        System.out.print("The sorted array is: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
