package OOPS;
import java.util.*;

// Interface for loan eligibility
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract BankAccount class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: public getters only
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public abstract double calculateInterest();

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + holderName + ", Balance: ₹" + balance);
    }

    // Setter for internal use (protected balance update)
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Application for ₹" + amount + " received.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Application for ₹" + amount + " received.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 25000;
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nAccount " + (i + 1));
            System.out.print("Enter account type (Savings/Current): ");
            String type = sc.next();

            System.out.print("Enter account number: ");
            String accNo = sc.next();

            System.out.print("Enter holder name: ");
            String name = sc.next();

            System.out.print("Enter initial balance: ₹");
            double balance = sc.nextDouble();

            if (type.equalsIgnoreCase("Savings")) {
                accounts.add(new SavingsAccount(accNo, name, balance));
            } else if (type.equalsIgnoreCase("Current")) {
                accounts.add(new CurrentAccount(accNo, name, balance));
            } else {
                System.out.println("Invalid account type! Skipping...");
            }
        }

        System.out.println("\n===== Bank Accounts Summary =====");
        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            double interest = acc.calculateInterest();
            System.out.println("Interest Earned: ₹" + interest);

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                if (loan.calculateLoanEligibility()) {
                    System.out.println("✅ Eligible for Loan");
                    loan.applyForLoan(50000); // sample amount
                } else {
                    System.out.println("❌ Not eligible for loan");
                }
            }

            System.out.println("---------------------------------");
        }
    }
}
