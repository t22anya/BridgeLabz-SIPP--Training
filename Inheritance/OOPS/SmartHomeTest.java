package OOPS;
	import java.util.Scanner;

	public class SmartHomeTest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // User input
	        System.out.print("Enter Device ID: ");
	        String deviceId = sc.nextLine();

	        System.out.print("Enter Device Status (ON/OFF): ");
	        String status = sc.nextLine();

	        System.out.print("Enter Temperature Setting: ");
	        double temperature = sc.nextDouble();

	        // Create Thermostat object (inherits from Device)
	        Thermostat thermostat = new Thermostat(deviceId, status, temperature);

	        // Display device status
	        System.out.println("\n--- Device Status ---");
	        thermostat.displayStatus();

	        sc.close();
	    }
	}

	// Superclass: Device
	class Device {
	    protected String deviceId;
	    protected String status;

	    public Device(String deviceId, String status) {
	        this.deviceId = deviceId;
	        this.status = status;
	    }

	    public void displayStatus() {
	        System.out.println("Device ID: " + deviceId);
	        System.out.println("Status: " + status);
	    }
	}

	// Subclass: Thermostat extends Device
	class Thermostat extends Device {
	    private double temperatureSetting;

	    public Thermostat(String deviceId, String status, double temperatureSetting) {
	        super(deviceId, status);
	        this.temperatureSetting = temperatureSetting;
	    }

	    @Override
	    public void displayStatus() {
	        super.displayStatus();
	        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
	    }
	}
