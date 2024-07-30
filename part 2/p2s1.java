import java.util.Scanner;

public class p2s1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.next();

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        System.out.println(frontTimes(str, n));
    }

   public static String frontTimes(String str, int n) {
        String front = str.substring(0, Math.min(3, str.length()));
         StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(front);
        }

        return result.toString();
    }
}
