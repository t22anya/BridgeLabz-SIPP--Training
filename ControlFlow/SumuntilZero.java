import java.util.*;
public class SumuntilZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int sum=0;
		while(true) {
			System.out.println("Please enter a number(0  or negative number) ");
		    int num =sc.nextInt();
		    if(num<=0) {
		    	break;
		    }
		    sum+=num;
		    
		
		}
		System.out.println("Total sum is :"+sum);
	}

}
