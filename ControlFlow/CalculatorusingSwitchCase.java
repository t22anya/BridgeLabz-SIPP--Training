import java.util.*;
public class CalculatorusingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int second = sc.nextInt();
		System.out.print("Enter operator ( +,-,*,/): ");
		String op =sc.next();
		switch(op) {
		case "+":
			System.out.println("Result = " +(first+second));
			break;
		
		case "-":
			System.out.println("Result = "+(first-second));
			break;
		case "*":
			System.out.println("Result = "+(first*second));
			break;
		case "/":
			if(second!=0) {
			System.out.println("Result = "+(first/second));
			}
			else {
				System.out.println("error cannot divided by zero!");
			}
			break;
			default:
				System.out.println("Invalid operator");
	}
	}
}
