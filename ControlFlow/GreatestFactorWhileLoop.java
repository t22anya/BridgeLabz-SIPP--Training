import java.util.*;
public class GreatestFactorWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int greatest =1;
		int counter = num-1;
		while(counter >=1) {
			if( num % counter ==0) {
				greatest = counter;
				break;
			}
			counter--;
		}
		System.out.println(greatest);

	}

}
