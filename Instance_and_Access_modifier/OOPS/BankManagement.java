package OOPS;
import java.util.*;
public class BankManagement {
public String accountNumber;
private double balance;
protected String accountholder;
BankManagement(String accountNumber,double balance,String accountholder){
	this.accountNumber= accountNumber;
	this.balance=balance;
	this.accountholder=accountholder;
}
public double getbalance() {
	return balance;
}
public void deposit(double amount) {
	if(amount>0) {
		balance+=amount;
		System.out.println("Deposited: "+amount);
		
	}
	else {
		System.out.println("invalid deposit amount");
	}
}
public void withdraww(double amount) {
	if(amount>0 && balance>=amount) {
		balance-=amount;
		System.out.println("Withdraw: "+amount);
	}
	else {
		System.out.println("Invalid or insufficient balance.");
	}
}
public void setBalance(double  balance) {
	if(balance>0){
		this.balance=balance;
		System.out.println("Balance has been set to :"+balance);
	}
	else {
		System.out.println("Invalid balance amount.");
	}
}
public void display() {
	System.out.println("account number: "+accountNumber);
	System.out.println("Account holder: "+accountholder);
	System.out.println("Balance: "+balance);
	
}
}
class SavingAccount extends BankManagement{
	public SavingAccount(String accountNumber,double balance,String accountholder) {
		super(accountNumber,balance,accountholder);
		
	}
	public void displaySavingDetails() {
		System.out.println("Saving account Number: "+accountNumber);
		System.out.println("Savings Account Holder: "+accountholder);
		System.out.println("Balance : "+getbalance());
	}
}