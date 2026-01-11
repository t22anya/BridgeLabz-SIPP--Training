import java.util.*;
public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 =sc.nextInt();
		System.out.println("Enter the second number");
		int num2= sc.nextInt();
		System.out.println("Enter the third number");
		int num3 =sc.nextInt();
		int[] res = findSmallestAndLargest(num1,num2,num3);
		
		
		System.out.println("Smallest: "+ res[0]);
		System.out.println("Largest: "+ res[1]);

	}
	public static int[] findSmallestAndLargest(int number1,int number2,int number3) {
		int smallest = Math.min(number1 ,Math.min(number2, number3));
		int largest =Math.max(number1,Math.max(number2,number3));
		return new int[] {smallest,largest};
	}
}
