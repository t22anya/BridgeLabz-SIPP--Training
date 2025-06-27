package OOPS;
import java.util.*;
public class Circle {
	double radius;
	Circle(){
		this(1.0);
	}
	Circle(double radius){
		this.radius=radius;
	}
	 double getArea() {
	        return 3.14 * radius * radius;
	    }

	    // Method to display details
	    void display() {
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + getArea());
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = sc.nextDouble();
	        Circle c1 = new Circle();           // uses default constructor
	        Circle c2 = new Circle(radius);        // uses parameterized constructor
	        System.out.println("---Default Circle---");
	        c1.display();

	        System.out.println("\n---Custom Circle---");
	        c2.display();

	}

}
