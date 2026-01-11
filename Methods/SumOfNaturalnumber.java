import java.util.*;
public class SumOfNaturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(sum(n));
		
	}
	public static int sum(int n) {
		int sum =0;
		for(int i =1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
