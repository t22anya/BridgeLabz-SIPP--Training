import java.util.*;
public class StudentFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fees= sc.nextInt();
		int discountPercent= sc.nextInt();
		int discount = ( fees * discountPercent)/100;
		int totalfees =  fees - discount;
		System.out.println(" The discount amount in INR " + discount + " and the Fees have to pay " + totalfees);
		sc.close();
		
	}

}

