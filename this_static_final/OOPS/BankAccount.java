package OOPS;
import java.util.Scanner;

public class BankAccount {

    // 1. Static - will be set by user
    static String bankName;
    static int totalAccounts = 0;

    // 3. Final
    private final int accountNumber;

    // 2. This
    private String accountHolderName;

    private double balance;

    // Constructor using 'this'
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display method
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Not a valid BankAccount object.");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Main method with full user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Set static bank name
        System.out.print("Enter Bank Name: ");
        bankName = sc.nextLine();

        // Account details
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount account = new BankAccount(accNum, holder, bal);

        System.out.println("\n--- Account Created ---");
        account.displayAccountDetails();

        // Deposit and withdraw
        System.out.print("\nEnter amount to deposit: ");
        double depositAmt = sc.nextDouble();
        account.deposit(depositAmt);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmt = sc.nextDouble();
        account.withdraw(withdrawAmt);

        System.out.println("\n--- Updated Account Details ---");
        account.displayAccountDetails();

        // Display total accounts
        BankAccount.getTotalAccounts();

       
    }
}
