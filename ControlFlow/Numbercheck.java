import java.util.*;
public class Numbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0) {
			System.out.println(" The input number is positive");
		}
		else if(number ==0) {
			System.out.println(" The input number is Zero");
		}
		else {
			System.out.println(" The input number is negative");
		}
		

	}

}
