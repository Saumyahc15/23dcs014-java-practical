//Program 1: Generating user-defined exception using "throw" and "throws" keyword
import java.util.*;
class InsufficientBankBalanceException extends Exception
 {
InsufficientBankBalanceException(String s)
{
	super(s);
}
 }
 class p26
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    double balance;

        System.out.print("Enter your initial account balance: ");
        balance = scanner.nextDouble();

        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
			if (balance < amount) {
            throw new InsufficientBankBalanceException("Insufficient balance in your account");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
            
        } catch (InsufficientBankBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

//Program 2: Differentiating checked and unchecked exceptions
/*public class p26 {
    public static void main(String[] args) {
        try {
            // Checked exception: FileNotFoundException
            FileReader fileReader = new FileReader("non-existent-file.txt");
            System.out.println("File found!");
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception: File not found!");
        }

        try {
            // Unchecked exception: NullPointerException
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Unchecked exception: Null pointer exception!");
        }

        try {
            // Checked exception: IOException
            FileReader fileReader2 = new FileReader("input.txt");
            fileReader2.read();
            fileReader2.close();
        } catch (IOException e) {
            System.out.println("Checked exception: IO exception!");
        }

        try {
            // Unchecked exception: ArithmeticException
            int x = 5 / 0;
            System.out.println("Result: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception: Arithmetic exception!");
        }
    }
}*/
