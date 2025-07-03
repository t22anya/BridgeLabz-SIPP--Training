package OOPS;
import java.util.*;

//Abstract Class RideVehicle
abstract class RideVehicle {
 private String vehicleId;
 private String driverName;
 private double ratePerKm;

 public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
     this.vehicleId = vehicleId;
     this.driverName = driverName;
     this.ratePerKm = ratePerKm;
 }

 // Encapsulated Getters & Setters
 public String getVehicleId() { return vehicleId; }
 public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

 public String getDriverName() { return driverName; }
 public void setDriverName(String driverName) { this.driverName = driverName; }

 public double getRatePerKm() { return ratePerKm; }
 public void setRatePerKm(double ratePerKm) { this.ratePerKm = ratePerKm; }

 // Abstract method
 public abstract double calculateFare(double distance);

 // Concrete method
 public void getVehicleDetails() {
     System.out.println("Vehicle ID: " + vehicleId);
     System.out.println("Driver Name: " + driverName);
     System.out.println("Rate per Km: ₹" + ratePerKm);
 }
}

//Interface GPS
interface GPS {
 String getCurrentLocation();
 void updateLocation(String newLocation);
}

//Car Class
class Cars extends RideVehicle implements GPS {
 private String currentLocation;

 public Cars(String vehicleId, String driverName, double ratePerKm) {
     super(vehicleId, driverName, ratePerKm);
     this.currentLocation = "Garage";
 }

 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance + 50; // ₹50 base fare
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     this.currentLocation = newLocation;
 }
}

//Bike Class
class Bikes extends RideVehicle implements GPS {
 private String currentLocation;

 public Bikes(String vehicleId, String driverName, double ratePerKm) {
     super(vehicleId, driverName, ratePerKm);
     this.currentLocation = "Garage";
 }

 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance + 20; // ₹20 base fare
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     this.currentLocation = newLocation;
 }
}

//Auto Class
class Auto extends RideVehicle implements GPS {
 private String currentLocation;

 public Auto(String vehicleId, String driverName, double ratePerKm) {
     super(vehicleId, driverName, ratePerKm);
     this.currentLocation = "Garage";
 }

 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance + 30; // ₹30 base fare
 }

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     this.currentLocation = newLocation;
 }
}
public class RideHandlingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<RideVehicle> rides = new ArrayList<>();

        System.out.print("Enter number of rides: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nRide " + (i + 1));
            System.out.print("Enter vehicle type (1-Car, 2-Bike, 3-Auto): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Vehicle ID: ");
            String vehicleId = sc.nextLine();

            System.out.print("Enter Driver Name: ");
            String driverName = sc.nextLine();

            System.out.print("Enter Rate per Km: ");
            double rate = sc.nextDouble();

            RideVehicle ride = null;
            if (type == 1) {
                ride = new Cars(vehicleId, driverName, rate);
            } else if (type == 2) {
                ride = new Bikes(vehicleId, driverName, rate);
            } else if (type == 3) {
                ride = new Auto(vehicleId, driverName, rate);
            } else {
                System.out.println("Invalid type! Skipping...");
                continue;
            }

            rides.add(ride);
        }
        
        System.out.print("\nEnter distance of each ride (in km): ");
        double distance = sc.nextDouble();

        System.out.println("\n--- Fare Summary ---");
        for (RideVehicle v : rides) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: ₹" + fare);

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("Customer Pickup Point");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println("-----------------------------");
        }	
     }

}