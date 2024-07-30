import java.util.Scanner;

public class p2s2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Number of 9's in the array: " + arrayCount9(arr));
    }

    public static int arrayCount9(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i == 9) {
                count++;
            }
        }
        return count;
    }
}
