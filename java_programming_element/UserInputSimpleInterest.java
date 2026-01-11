import java.util.*;
public class UserInputSimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int principal = sc.nextInt();
		int rate =sc.nextInt();
		int time = sc.nextInt();
		int SimpleInterest = (principal * rate * time) / 100;
		System.out.println(" The Simple Interest is " + SimpleInterest + " for principal , " + principal + " rate , " + rate + " and time " + time );
		sc.close();

	}

}
