import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=0) {
			System.out.println( " Please enter a positive number ");
			return;
		}
		int i=1;
		while(i<=num) {
			if(i % 3 == 0 && i %5==0) {
				System.out.println( "FizzBuzz");
			}
			else if (i% 5 ==0) {
				System.out.println("Buzz");
			}
			else if( i%3 == 0) {
				System.out.println("Fizz");
			}
			else {
				System.out.println(i);
			}
			i++;
		}

	}

}
