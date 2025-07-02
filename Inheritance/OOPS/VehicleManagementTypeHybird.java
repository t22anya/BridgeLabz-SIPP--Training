package OOPS;
import java.util.*;
interface Refuelable {
	void refuel();
}
class Vehicles{
	protected int maxSpeed;
	protected String model;
	Vehicles(int maxSpeed,String model){
		this.maxSpeed=maxSpeed;
		this.model=model;
	}
	public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
class ElectricalVehicle extends Vehicles {
	private int batteryCapacity;
	public ElectricalVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging Electric Vehicle with " + batteryCapacity + " kWh battery.");
    }

    public void displayElectricInfo() {
        displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
class PetrolVehicle extends Vehicles implements Refuelable {
    private int fuelTankCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(maxSpeed,model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling Petrol Vehicle with " + fuelTankCapacity + " liters tank.");
    }

    public void displayPetrolInfo() {
        displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}
public class VehicleManagementTypeHybird {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Electric Vehicle Input
        System.out.println("Enter Electric Vehicle Details:");
        System.out.print("Model: ");
        String evModel = sc.nextLine();
        System.out.print("Max Speed (km/h): ");
        int evSpeed = sc.nextInt();
        System.out.print("Battery Capacity (kWh): ");
        int battery = sc.nextInt();
        sc.nextLine(); // consume newline
        ElectricalVehicle ev = new ElectricalVehicle(evModel, evSpeed, battery);

        // Petrol Vehicle Input
        System.out.println("\nEnter Petrol Vehicle Details:");
        System.out.print("Model: ");
        String pvModel = sc.nextLine();
        System.out.print("Max Speed (km/h): ");
        int pvSpeed = sc.nextInt();
        System.out.print("Fuel Tank Capacity (liters): ");
        int tank = sc.nextInt();

        PetrolVehicle pv = new PetrolVehicle(pvModel, pvSpeed, tank);

        // Display info and actions
        System.out.println("\n--- Vehicle Summary ---");

        System.out.println("\nElectric Vehicle:");
        ev.displayElectricInfo();
        ev.charge();

        System.out.println("\nPetrol Vehicle:");
        pv.displayPetrolInfo();
        pv.refuel();

	}
}
