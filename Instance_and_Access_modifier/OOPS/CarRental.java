package OOPS;
import java.util.*;
public class CarRental {
	String customerName;
	String carModel;
	int rentalDays;
	double ratePerDay;
	CarRental(String customerName,String carModel,int rentalDays,double ratePerDay){
		this.customerName=customerName;
		this.carModel=carModel;
		this.rentalDays=rentalDays;
		this.ratePerDay=ratePerDay;
	}
	double totalCost() {
		return rentalDays*ratePerDay;
	}
	 public void displayDetails() {
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Car Model: " + carModel);
	        System.out.println("Rental Days: " + rentalDays);
	        System.out.println("Rate per Day: ₹" + ratePerDay);
	        System.out.println("Total Cost: ₹" + totalCost());
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the customer: ");
		String customerName = sc.nextLine();
		System.out.println("Enter the model name: ");
		String carModel=sc.next();
		System.out.println("Enter the rental days: ");
		int rentalDays=sc.nextInt();
		System.out.print("Enter rate per day: ");
        double ratePerDay = sc.nextDouble();
        CarRental rent = new CarRental(customerName,carModel,rentalDays,ratePerDay);
        rent.displayDetails();
		
	}

}
