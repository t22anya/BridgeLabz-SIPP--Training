import java.util.*;
public class DivideChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of chocolates: ");
		int num = sc.nextInt();
		System.out.println("Enter the number of children: ");
		int childnum = sc.nextInt();
		int[] res = findRemainderAndQuotient(num,childnum);
		System.out.println("Chocolate each children get: "+res[0]);
		System.out.println("Chocolate remaining: "+res[1]);
		
		
		

	}
	public static int[] findRemainderAndQuotient(int number,int divisor) {
		int distributed= number/divisor;
		int remaining = number %divisor;
		return new int[] {distributed,remaining};
	}
}
