import java.util.*;
public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		if(num >=100 || num <=0) {
			System.out.println(" Please Enter a Valid number Between range from 0 to 100");
		}
		int counter =num-1;
		 System.out.println("Multiples of " + num + " (excluding 1 and itself) are:");
		while(counter>1) {
			if(num % counter ==0) {
				System.out.println(counter);
			}
			counter--;
		}
	}

}
