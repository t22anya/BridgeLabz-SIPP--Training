package OOPS;
import java.util.*;
public class Main_Employee_record {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();
	        System.out.print("Enter Salary: ");
	        double sal = sc.nextDouble();
	        sc.nextLine(); // consume newline
	        System.out.print("Enter Department: ");
	        String dept = sc.nextLine();

	        Manager mgr = new Manager(id, sal, dept);

	        System.out.println("\n--- Initial Manager Details ---");
	        mgr.displayManagerDetails();

	        System.out.print("\nEnter new salary to update: ");
	        double newSalary = sc.nextDouble();
	        mgr.updateSalary(newSalary);

	        System.out.println("\n--- Updated Manager Details ---");
	        mgr.displayManagerDetails();

	        sc.close();
	    }
	}

