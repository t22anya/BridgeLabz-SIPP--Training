package OOPS;
import java.util.*;

//Abstract Class
abstract class Employee {
 private int employeeId;
 private String name;
 private double baseSalary;

 public Employee(int employeeId, String name, double baseSalary) {
     this.employeeId = employeeId;
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public int getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 public double getBaseSalary() {
     return baseSalary;
 }

 public void setBaseSalary(double baseSalary) {
     this.baseSalary = baseSalary;
 }

 public abstract double calculateSalary();

 public void displayDetails() {
     System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
 }
}

//Interface
interface Department {
 void assignDepartment(String departmentName);
 String getDepartmentDetails();
}

//Full-time Employee
class FullTimeEmployee extends Employee implements Department {
 private String department;
 private double fixedAllowance;

 public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedAllowance) {
     super(employeeId, name, baseSalary);
     this.fixedAllowance = fixedAllowance;
 }

 @Override
 public double calculateSalary() {
     return getBaseSalary() + fixedAllowance;
 }

 @Override
 public void assignDepartment(String departmentName) {
     this.department = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return "Full-Time Department: " + department;
 }
}

//Part-time Employee
class PartTimeEmployee extends Employee implements Department {
 private String department;
 private int hoursWorked;
 private double hourlyRate;

 public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
     super(employeeId, name, 0);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public double calculateSalary() {
     return hourlyRate * hoursWorked;
 }

 @Override
 public void assignDepartment(String departmentName) {
     this.department = departmentName;
 }

 @Override
 public String getDepartmentDetails() {
     return "Part-Time Department: " + department;
 }
}

//Main Class
public class EmployeeManagementSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     List<Employee> employees = new ArrayList<>();

     System.out.print("Enter number of employees: ");
     int n = sc.nextInt();
     sc.nextLine(); // consume newline

     for (int i = 0; i < n; i++) {
         System.out.println("\nEnter details for Employee " + (i + 1));
         System.out.print("Is the employee Full-time or Part-time? (F/P): ");
         char type = sc.nextLine().charAt(0);

         System.out.print("Enter Employee ID: ");
         int id = sc.nextInt();
         sc.nextLine(); // consume newline

         System.out.print("Enter Name: ");
         String name = sc.nextLine();

         if (type == 'F' || type == 'f') {
             System.out.print("Enter Base Salary: ");
             double base = sc.nextDouble();

             System.out.print("Enter Fixed Allowance: ");
             double allowance = sc.nextDouble();
             sc.nextLine();

             System.out.print("Enter Department: ");
             String dept = sc.nextLine();

             FullTimeEmployee emp = new FullTimeEmployee(id, name, base, allowance);
             emp.assignDepartment(dept);
             employees.add(emp);

         } else if (type == 'P' || type == 'p') {
             System.out.print("Enter Hourly Rate: ");
             double rate = sc.nextDouble();

             System.out.print("Enter Hours Worked: ");
             int hours = sc.nextInt();
             sc.nextLine();

             System.out.print("Enter Department: ");
             String dept = sc.nextLine();

             PartTimeEmployee emp = new PartTimeEmployee(id, name, rate, hours);
             emp.assignDepartment(dept);
             employees.add(emp);
         } else {
             System.out.println("Invalid type. Skipping...");
         }
     }

     System.out.println("\n===== Employee Details =====\n");
     for (Employee emp : employees) {
         emp.displayDetails();
         System.out.println("Total Salary: ₹" + emp.calculateSalary());

         if (emp instanceof Department) {
             System.out.println(((Department) emp).getDepartmentDetails());
         }

         System.out.println("----------------------------------");
     }
 }
}
