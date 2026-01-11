import java.util.*;
public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int num1 =sc.nextInt();
	int num2 =sc.nextInt();
	int num3= sc.nextInt();
	boolean isFirstLargest = false;
	boolean isSecondLargest = false;
	boolean isthirdLargest = false;
	if(num1 > num2 && num1> num3) {
		isFirstLargest =true;
	}
	else if( num2 > num1 && num2> num3) {
		isSecondLargest  = true;
	}
	else if(num3> num1 && num3> num2) {
		isthirdLargest =true;
	}
	System.out.println(" Is the first number largest ?" +isFirstLargest);
	System.out.println( "Is the Second number Largest ? " +isSecondLargest);
	System.out.println( " Is the third number Largest ?" +isthirdLargest);
	

	}

}
