import java.util.Scanner;

public class p2s3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        System.out.println("Original string: " + str);
        System.out.println("New string: " + newStr);
    }
}
