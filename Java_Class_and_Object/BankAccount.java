import java.util.*;
public class BankAccount {
	String accountHolder;
	String accountNumber;
	double balance;
	BankAccount(String accountHolder,String accountNumber,double balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	void depositmoney(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Rs" + amount+ " added successfully ");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Rs"+ amount +" withdraw successfully.");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	void display() {
		System.out.println("Account holder name: "+accountHolder);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Balance: "+balance);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter account holder name: ");
	        String holder = sc.nextLine();

	        System.out.print("Enter account number: ");
	        String accNum = sc.nextLine();

	        System.out.print("Enter initial balance: ");
	        double bal = sc.nextDouble();

	        BankAccount account = new BankAccount(holder, accNum, bal);

	        System.out.print("Enter amount to deposit: ");
	        double depositAmt = sc.nextDouble();
	        account.depositmoney(depositAmt);

	        System.out.print("Enter amount to withdraw: ");
	        double withdrawAmt = sc.nextDouble();
	        account.withdraw(withdrawAmt);

	        account.display();


	}

}
