import java.util.*;
public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight of a person in kg: ");
		double weight =sc.nextInt();
		System.out.println("Enter the height (in cm) of person: ");
		double height = sc.nextInt();
		double BMI = weight/(height*height);
		System.out.println("Your BMI is: " + BMI);
		 if (BMI < 18.5) {
	            System.out.println("You are Underweight.");
	        } else if (BMI < 24.9) {
	            System.out.println("You have Normal weight.");
	        } else if (BMI < 29.9) {
	            System.out.println("You are Overweight.");
	        } else {
	            System.out.println("You are Obese.");
	        }
	}

}
