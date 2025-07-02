package OOPS;

import java.util.*;

//Interface
interface Worker {
 void performDuties();
}

//Superclass
class Person {
 protected String name;
 protected int id;

 public Person(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }
}

//Subclass: Chef
class Chef extends Person implements Worker {
 private String specialty;

 public Chef(String name, int id, String specialty) {
     super(name, id);
     this.specialty = specialty;
 }

 @Override
 public void performDuties() {
     System.out.println("Chef Duties: Preparing " + specialty + " dishes.");
 }

 public void displayChefInfo() {
     displayInfo();
     System.out.println("Specialty: " + specialty);
 }
}

//Subclass: Waiter
class Waiter extends Person implements Worker {
 private int tableCount;

 public Waiter(String name, int id, int tableCount) {
     super(name, id);
     this.tableCount = tableCount;
 }

 @Override
 public void performDuties() {
     System.out.println("Waiter Duties: Serving " + tableCount + " tables.");
 }

 public void displayWaiterInfo() {
     displayInfo();
     System.out.println("Tables Assigned: " + tableCount);
 }
}

//Main class
public class RestaurantSystemTest {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Input for Chef
     System.out.println("Enter Chef Details:");
     System.out.print("Name: ");
     String chefName = sc.nextLine();
     System.out.print("ID: ");
     int chefId = sc.nextInt();
     sc.nextLine(); // consume newline
     System.out.print("Specialty Dish: ");
     String specialty = sc.nextLine();

     Chef chef = new Chef(chefName, chefId, specialty);

     // Input for Waiter
     System.out.println("\nEnter Waiter Details:");
     System.out.print("Name: ");
     String waiterName = sc.nextLine();
     System.out.print("ID: ");
     int waiterId = sc.nextInt();
     System.out.print("Number of Tables Assigned: ");
     int tables = sc.nextInt();

     Waiter waiter = new Waiter(waiterName, waiterId, tables);

     // Display information and duties
     System.out.println("\n--- Restaurant Staff ---");

     System.out.println("\nChef Info:");
     chef.displayChefInfo();
     chef.performDuties();

     System.out.println("\nWaiter Info:");
     waiter.displayWaiterInfo();
     waiter.performDuties();

 }
}
