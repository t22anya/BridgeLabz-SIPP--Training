import java.util.*;
public class AreaOfCircle {
	double radius;

	AreaOfCircle(double radius){
		this.radius=radius;
		
	}
	void displayResult() {
		System.out.println("Radius of circle: "+radius);
		System.out.println("Circumference of a circle: "+circumference());
		System.out.println("Area of circle: "+area());
	}
	double circumference() {
		return 3.14 * 2 * radius;
	}
	double area() {
		return 3.14 * Math.pow(radius, 2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  radius: ");
		double radius = sc.nextInt();
		double circumference = 2* 3.14 * radius;
		double area = 3.14 *radius * radius;
		AreaOfCircle circle =  new AreaOfCircle(radius);
		circle.displayResult();
		sc.close();
		
		

	}

}
