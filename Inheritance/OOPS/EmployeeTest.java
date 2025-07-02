package OOPS;
import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee type (Manager/Developer/Intern)");
		String type =sc.next();
		System.out.println("Enter the name of the " +type);
		String name =sc.next();
		System.out.println("Enter the age of the " +type);
		int id  =sc.nextInt();
		System.out.println("Enter the salary of the " +type);
		double  salary =sc.nextDouble();
		Employee employee;
		switch(type.toLowerCase()) {
		case "manager":
			System.out.println("Enter team size:");
			int teamSize=sc.nextInt();
			employee = new Manager(name,id,salary,teamSize);
			break;
		case "developer":
			System.out.println("Enter programming language:");
			String lang = sc.nextLine();
			employee = new Developer(name,id,salary,lang);
		case "intern":
			System.out.print("Enter internship duration (in months): ");
            int duration = sc.nextInt();
            employee = new Intern(name, id, salary, duration);
            break;
		 default:
             System.out.println("Unknown type, using base Employee.");
             employee = new Employee(name, id, salary);
     }

     employee.displayDetails();
		
	}

}
class Employee{
	protected String name;
	protected int id;
	protected double salary;
	public Employee(String name,int id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	 public void displayDetails() {
	        System.out.println("\nEmployee Details:");
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Salary: ₹" + salary);
	    }
}
class  Manager extends Employee{
	private int teamSize=0;
	public Manager(String name,int id ,double salary,int teamSize){
		super(name,id,salary);
		this.teamSize=teamSize;
	}
	public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee{
	private String ProgrammingLanguage ;
	Developer(String name,int id ,double salary,String ProgrammingLanguage){
		super(name,id,salary);
		this.ProgrammingLanguage=ProgrammingLanguage;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Role : Developer");
		System.out.println("PRpgramming Langauge: "+ProgrammingLanguage);
	}
}
class Intern extends Employee{
	private int duration;
	Intern(String name,int id ,double salary,int duration){
		super(name, id, salary);
		this.duration=duration;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Role: Intern ");
		 System.out.println("Internship Duration: " + duration + " months");
	}
}