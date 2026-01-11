import java.util.*;
public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");

		int num2 = sc.nextInt();
		int[] result = findRemainderAndQuotient(num1, num2);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
		

	}
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quotient = number/divisor;
		int remainder =number %divisor;
		return new int[] {quotient,remainder};
	}

}
