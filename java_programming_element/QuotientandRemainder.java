import java.util.*;
public class QuotientandRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int quotient = num1 / num2;
		int remainder = num1% num2;
		System.out.println(" The quotient is " + quotient + " and the remainder  is "+ remainder + " of two number " + num1 + " and " + num2 );
		sc.close();

	}

}
