package OOPS;

public class Employee {
public int employeeID;
private double salary;
protected String department;
Employee(int employeeID,double salary,String department){
	this.employeeID=employeeID;
	this.salary=salary;
	this.department=department;
}
public void updateSalary(double amount) {
	 if (amount >= 0) {
         this.salary = amount;
         System.out.println("Salary updated to: " + salary);
     } else {
         System.out.println("Invalid salary amount.");
     }
}
public double getSalary() {
    return salary;
}
public void displayEmployeeDetails() {
    System.out.println("Employee ID: " + employeeID);
    System.out.println("Department: " + department);
    System.out.println("Salary: " + salary);
}

}
class Manager extends Employee{
	public Manager(int employeeID,double salary,String department) {
		super(employeeID,salary,department);
	}
	public void displayManagerDetails() {
		 System.out.println("Manager ID: " + employeeID);        
	        System.out.println("Manager Department: " + department); 
	        System.out.println("Manager Salary: " + getSalary());
	}
}
