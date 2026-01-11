import java.util.*;
public class CountNumberOFdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int count=0;
		if(num ==0) {
			count=1;
		}else {
			num =Math.abs(num);
		while(num>0) {
			count++;
			num= num/10;
		}
	}
	System.out.println("Number of digits: " +count);
}
}
