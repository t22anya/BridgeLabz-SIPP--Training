package OOPS;

import java.util.*;

public class BankSystemTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Savings Account
        System.out.println("Enter Savings Account Details:");
        System.out.print("Account Number: ");
        String accNum1 = sc.nextLine();
        System.out.print("Balance: ");
        double balance1 = sc.nextDouble();
        System.out.print("Interest Rate (%): ");
        double interestRate = sc.nextDouble();
        sc.nextLine(); // consume newline
        BankAccount savings = new SavingsAccount(accNum1, balance1, interestRate);

        // Input for Checking Account
        System.out.println("\nEnter Checking Account Details:");
        System.out.print("Account Number: ");
        String accNum2 = sc.nextLine();
        System.out.print("Balance: ");
        double balance2 = sc.nextDouble();
        System.out.print("Withdrawal Limit: ");
        double withdrawalLimit = sc.nextDouble();
        sc.nextLine(); // consume newline
        BankAccount checking = new CheckingAccount(accNum2, balance2, withdrawalLimit);

        // Input for Fixed Deposit Account
        System.out.println("\nEnter Fixed Deposit Account Details:");
        System.out.print("Account Number: ");
        String accNum3 = sc.nextLine();
        System.out.print("Balance: ");
        double balance3 = sc.nextDouble();
        System.out.print("Maturity Period (in months): ");
        int period = sc.nextInt();

        BankAccount fixed = new FixedDepositAccount(accNum3, balance3, period);

        // Display account types and details
        System.out.println("\n--- Account Summaries ---");
        savings.displayAccountType();
        checking.displayAccountType();
        fixed.displayAccountType();

        sc.close();
    }
}

// Superclass
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass 1: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("\nSavings Account");
        super.displayAccountType();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("\nChecking Account");
        super.displayAccountType();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

// Subclass 3: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("\nFixed Deposit Account");
        super.displayAccountType();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

