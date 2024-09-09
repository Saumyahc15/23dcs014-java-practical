import java.util.*;
class InsufficientBankBalanceException extends Exception
 {
InsufficientBankBalanceException(String s)
{
	super(s);
}
 }
 class user_define_extra4
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
