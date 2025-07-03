package OOPS;
import java.util.*;

// Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        // insurancePolicyNumber is not stored to simulate encapsulation
    }

    // Getters
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate/Day: ₹" + rentalRate);
    }
}

// Car class
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Car", rentalRate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // ₹500 pickup charge
    }

    @Override
    public double calculateInsurance() {
        return 3000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: ₹3000 (Fixed)";
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Bike", rentalRate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: ₹1000 (Fixed)";
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Truck", rentalRate, policyNo);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 2000; // Loading fees
    }

    @Override
    public double calculateInsurance() {
        return 5000.0;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: ₹5000 (Fixed)";
    }
}

// Main class
public class VehicleRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        System.out.println("Enter number of vehicles to rent:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter vehicle type (Car/Bike/Truck): ");
            String type = sc.next();

            System.out.print("Enter vehicle number: ");
            String number = sc.next();

            System.out.print("Enter rental rate per day: ");
            double rate = sc.nextDouble();

            System.out.print("Enter insurance policy number: ");
            String policy = sc.next();

            if (type.equalsIgnoreCase("Car")) {
                vehicles.add(new Car(number, rate, policy));
            } else if (type.equalsIgnoreCase("Bike")) {
                vehicles.add(new Bike(number, rate, policy));
            } else if (type.equalsIgnoreCase("Truck")) {
                vehicles.add(new Truck(number, rate, policy));
            } else {
                System.out.println("Invalid type! Skipping...");
            }
        }

        System.out.print("\nEnter number of rental days: ");
        int days = sc.nextInt();

        System.out.println("\n======= Rental Summary =======");
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental for " + days + " days: ₹" + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: ₹" + ins.calculateInsurance());
            }

            System.out.println("-----------------------------------");
        }
    }
}
