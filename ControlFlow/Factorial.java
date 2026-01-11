import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int fact =1;
		int i= num;
		while(i>0) {
			fact*= i;
			i--;
		}
		System.out.println(" Factorial of a given number is " + fact	);
		}

}
