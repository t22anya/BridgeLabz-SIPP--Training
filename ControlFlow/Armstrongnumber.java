import java.util.*;
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum =0;
		int original = num ;
		while(num>0) {
			int digit = num%10;
			sum+= digit*digit*digit;
			num = num/10;
		}
		if(sum == original) {
			System.out.println(original + " is an Amstrong number.");
		}
		else {
			System.out.println(original  +" is not a armstrong number.");
		}
	}

}
