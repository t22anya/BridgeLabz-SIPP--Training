package  OOPS;
import java.util.*;
public class Employee {
    // Static
    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    // Final
    final int id;

    // Instance variables
    String name;
    String designation;

    // Constructor using 'this'
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to print employee details using instanceof
    public static void printEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + emp.id);
            System.out.println("Name: " + emp.name);
            System.out.println("Designation: " + emp.designation);
        } else {
            System.out.println("Object is not an Employee");
        }
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();

        // Create Employee object using user input
        Employee emp1 = new Employee(id, name, designation);

        // Display employee details
        printEmployeeDetails(emp1);

        // Show total employees
        displayTotalEmployees();

    }
}
