package OOPS;
import java.util.*;
public class Vehicle {
	private static double registrationFee;
	
	public static void updateRegistration(double newFee) {
		registrationFee = newFee;
	}
	private String ownerName;
	private String vehicleType;
	private final  int RegistrationNumber;
	Vehicle(String ownerName, String vehicleType,int RegistrationNumber){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		this.RegistrationNumber=RegistrationNumber;
	}
	public void display() {
		System.out.println("owner Name: "+ownerName);
		System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Registration number: "+RegistrationNumber);
		 System.out.println("Registration Fee: " + registrationFee);
		
	}
	public static void printVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            v.display();
        } else {
            System.out.println("Not a Vehicle object.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter registration fee for all vehicles: ");
        double fee = sc.nextDouble();
        Vehicle.updateRegistration(fee);

        System.out.print("How many vehicles do you want to register? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for vehicle " + (i + 1));
            System.out.print("Owner Name: ");
            String owner = sc.nextLine();

            System.out.print("Vehicle Type: ");
            String type = sc.nextLine();

            System.out.print("Registration Number (unique int): ");
            int regNo = sc.nextInt();
            sc.nextLine(); // consume newline

            vehicles[i] = new Vehicle(owner, type, regNo);
        }

        System.out.println("\n--- Vehicle Details ---");
        for (Vehicle v : vehicles) {
            Vehicle.printVehicleDetails(v);
            System.out.println("-------------------------");
        }

}}

