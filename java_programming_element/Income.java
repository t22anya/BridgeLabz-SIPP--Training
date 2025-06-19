import java.util.*;
public class Income {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int salary = sc.nextInt();
		int bonus = sc.nextInt();
		int income =salary+bonus;
		System.out.println( " The salary is in INR " +salary + " and the bonus is " + bonus + ". Hence the total income is " + income);
		sc.close();
		

	}

}
