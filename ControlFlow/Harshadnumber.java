import java.util.*;
public class Harshadnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int original =num;
		while(num>0) {
			int digit =num%10;
			sum+=digit;
			num =num/10;
		}
		if(original % sum ==0) {
			System.out.println(original+ " is a harshad number");
		}
		else {
			System.out.println(original+" is not  harshad number");
		}
		sc.close();
	}

}
