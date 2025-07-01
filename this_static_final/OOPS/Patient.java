package OOPS;
import java.util.*;
public class Patient {
	private static String hospitalName;
	private static int totalpatient=0;
	private String name;
	private int age;
	private String ailment;
	private final int patientID;
	public static void getTotalPatients() {
		System.out.println("Total patients admitted: "+totalpatient);
	}
	Patient(int patientID,String name, int age, String ailment){
		this.patientID=patientID;
		this.name=name;
		this.age=age;
		this.ailment=ailment;
		totalpatient++;
	}
	public void display() {
		if(this instanceof Patient) {
			   System.out.println("Hospital Name: " + hospitalName);
	            System.out.println("Patient ID: " + patientID);
	            System.out.println("Name: " + name);
	            System.out.println("Age: " + age);
	            System.out.println("Ailment: " + ailment);
	            System.out.println("---------------------------");
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of patients: ");
		int n =sc.nextInt();
		Patient [] patients= new Patient[n];
		for(int i =0;i<n;i++) {
			System.out.println("Enter details for patient "+(i+1)+":");
			System.out.print("Patient ID: ");
		    int id = sc.nextInt();
		    sc.nextLine(); // consume newline

		    System.out.print("Name: ");
		    String name = sc.nextLine();

		    System.out.print("Age: ");
		    int age = sc.nextInt();
		    sc.nextLine(); // consume newline

		    System.out.print("Ailment: ");
		    String ailment = sc.nextLine();
	            patients[i] = new Patient(id,name,age,ailment);
		}
		
		  System.out.println("\n--- Patient Details ---");
	        for (Patient p : patients) {
	            p.display();
	        }

	        getTotalPatients();

	}

}
