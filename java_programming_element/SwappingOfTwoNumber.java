import java.util.*;
public class SwappingOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		 num1 = num1 + num2 ;
		 num2 = num1 - num2;
		 num1 = num1-num2;
		 System.out.println( " The Swapped numbers are " + num1 + " and " + num2);
		 sc.close();
		

	}

}
