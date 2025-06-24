import java.util.*;

// Employee class definition
class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Name  : " + name);
        System.out.println("Employee ID    : " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // Create employee object with user input
        Employee emp = new Employee(name, id, salary);

        // Display employee details
        emp.displayDetails();

        sc.close();
    }
}
