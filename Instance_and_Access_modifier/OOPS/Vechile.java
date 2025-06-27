package OOPS;
import java.util.*;
public class Vechile {
	String ownerName;
	String vehicleType;
	static double registrationFee;
	Vechile(String ownerName,String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
	}
	void displayDetails() {
		System.out.println("owner name: "+ownerName);
		System.out.println("vehicle type  : "+vehicleType);
		System.out.println("Registration Fees : "+registrationFee);
	}
	static void updateRegistrationDetails(double newFee) {
		registrationFee=newFee;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.print("Enter Registration Fee for all vehicles: ₹");
		Scanner sc = new Scanner(System.in);
		double fee = sc.nextDouble();
        updateRegistrationDetails(fee);
        // Take number of vehicles
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Vechile[] vehicles = new Vechile[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1) + ":");

            System.out.print("Owner Name: ");
            String owner = sc.nextLine();

            System.out.print("Vehicle Type: ");
            String type = sc.nextLine();

            vehicles[i] = new Vechile(owner, type);
        }

        // Display vehicle details
        System.out.println("\n--- Vehicle Details ---");
        for (Vechile v : vehicles) {
            v.displayDetails();
        }

	}

}
