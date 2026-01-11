import java.util.*;
public class BonusEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the employee salary: ");
		double salary = sc.nextDouble();
		System.out.println("Enter the years of service: ");
		int year =sc.nextInt();
		if(year>5) {
			 double bonus = 0.05 * salary;
			 System.out.println("Bonus awarded : Rs." +bonus);
		}
		else {
			System.out.println("No bonus awarded(less than or equal to 5 years of service).") ;
		}

	}

}
