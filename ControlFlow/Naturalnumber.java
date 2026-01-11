import java.util.*;
public class Naturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=1) {
			int sum =0;
			sum = (n* (n+1))/2;
			System.out.println(" The sum of "+ n + " natural number is " +sum);
			
		}
		else {
			System.out.println(" The number " +n +" is not a natural number");
		}
		sc.close();

	}

}
