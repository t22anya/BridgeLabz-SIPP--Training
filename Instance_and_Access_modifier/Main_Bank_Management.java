package OOPS;
import java.util.Scanner;

public class Main_Bank_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        SavingAccount sa = new SavingAccount(accNo, initialBalance, name); // ✅ correct order

        System.out.println("\nInitial Balance: " + sa.getbalance());

        System.out.print("\nEnter New Balance to Set: ");
        double newBalance = sc.nextDouble();
        sa.setBalance(newBalance);

        System.out.println("\nUpdated Account Details:");
        sa.displaySavingDetails();

        sc.close();
    }
}
