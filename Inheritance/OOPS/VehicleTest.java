package OOPS;
import java.util.*;
public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		//Input for Car
		
		Vehicle[] vehicles = new Vehicle[3];
		 System.out.println("Enter Car details:");
	        System.out.print("Max Speed: ");
	        int carSpeed = sc.nextInt();
	        sc.nextLine(); // consume newline
	        System.out.print("Fuel Type: ");
	        String carFuel = sc.nextLine();
	        System.out.print("Seat Capacity: ");
	        int seatCap = sc.nextInt();
	        vehicles[0] = new Car(carSpeed, carFuel, seatCap);
	        //Input for Truck
	        System.out.println("\nEnter Truck details:");
	        System.out.print("Max Speed: ");
	        int truckSpeed = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Fuel Type: ");
	        String truckFuel = sc.nextLine();
	        System.out.print("Load Capacity (kg): ");
	        int loadCap = sc.nextInt();
	        vehicles[1] = new Truck(truckSpeed, truckFuel, loadCap);

	        // Input for Motorcycle
	        System.out.println("\nEnter Motorcycle details:");
	        System.out.print("Max Speed: ");
	        int bikeSpeed = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Fuel Type: ");
	        String bikeFuel = sc.nextLine();
	        System.out.print("Motorcycle Type : ");
	        String bikeType = sc.nextLine();
	        vehicles[2] = new Motorcycle(bikeSpeed, bikeFuel, bikeType);

	        System.out.println("\n--- Vehicle Information ---");
	        for (Vehicle v : vehicles) {
	            v.displayDetails();
	            System.out.println();
	            }
	}

}
class Vehicle{
	protected int maxSpeed;
	protected String fuelType;
	public Vehicle(int maxSpeed,String fuelType) {
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
	}
	public void displayDetails() {
		System.out.println("Max Speed : "+maxSpeed +"km/h");
		System.out.println("Fuel Type: "+fuelType);
	}
}
class Car extends Vehicle{
	private int seatCapacity;
	Car(int maxSpeed,String fuelType,int seatCapacity){
		super(maxSpeed,fuelType);
		this.seatCapacity=seatCapacity;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Vehicle Type: Car");
        System.out.println("Seat Capacity: " + seatCapacity);
	}
}
class Truck extends Vehicle{
	private double loadCapacity;
	Truck(int maxSpeed,String fuelType,double loadCapacity){
		super(maxSpeed,fuelType);
		this.loadCapacity=loadCapacity;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Vehicle Type: Truck");
        System.out.println("Loading Capacity: " + loadCapacity);
	}
}
class Motorcycle extends Vehicle{
	private String type;
	Motorcycle(int maxSpeed,String fuelType,String type){
		super(maxSpeed,fuelType);
		this.type=type;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Vehicle Type: MotorCycle");
        System.out.println("Type of Motorcycle: " + type);
	}
}

