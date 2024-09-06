import java.util.Scanner;

// Interface for Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

// Class for SavingsAccount
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void calculateInterest() {
        balance += balance * interestRate / 100;
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }

    public void checkMinimumBalance() {
        if (balance < 1000) {
            System.out.println("Minimum balance requirement not met");
        }
    }
}

// Class for CurrentAccount
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance and overdraft limit");
        }
    }

    @Override
    public void calculateInterest() {
        // No interest for CurrentAccount
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    public void checkOverdraftLimit() {
        if (balance < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

// Class for Bank
class Bank {
    public Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public void addAccount(Account account) {
        this.account = account;
    }

    public void viewAccount() {
        account.viewBalance();
    }
}

public class sup2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = null;

        while (true) {
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Calculate Interest");
            System.out.println("6. View Account");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter initial balance: ");
                    double savingsBalance = scanner.nextDouble();
                    System.out.print("Enter interest rate: ");
                    double savingsInterestRate = scanner.nextDouble();
                    SavingsAccount savingsAccount = new SavingsAccount(savingsBalance, savingsInterestRate);
                    bank = new Bank(savingsAccount);
                    break;
                case 2:
                    System.out.print("Enter initial balance: ");
                    double currentBalance = scanner.nextDouble();
                    System.out.print("Enter overdraft limit: ");
                    double currentOverdraftLimit = scanner.nextDouble();
                    CurrentAccount currentAccount = new CurrentAccount(currentBalance, currentOverdraftLimit);
                    bank = new Bank(currentAccount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.account.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.account.withdraw(withdrawAmount);
                    break;
                case 5:
                    bank.account.calculateInterest();
                    break;
                case 6:
                    bank.viewAccount();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
