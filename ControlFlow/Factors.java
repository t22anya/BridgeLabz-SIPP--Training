import java.util.*;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		if(num <=0) {
			System.out.println("Please enter a positive integer");
		}
		int counter =1;
		while(counter<num) {
			if(num % counter==0) {
				System.out.println(counter);
			}
			counter++;
		}

	}

}
