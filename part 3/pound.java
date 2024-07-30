import java.lang.*;
import java.util.*;

class pound {
    public static void main(String a[]) {
        try {
            int x = Integer.parseInt(a[0]);
            int c = x * 100;
            System.out.println("Value in rupees is " + c);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}
