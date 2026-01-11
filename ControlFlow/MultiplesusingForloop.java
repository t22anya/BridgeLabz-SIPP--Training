import java.util.*;
public class MultiplesusingForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num >=100 || num <=0) {
			System.out.println("Please enter a valid number from range 0 to 100");
		}
		int counter = num-1;
		for(int i=100;i>=1;i--) {
			if(i%num ==0 && i<100) {
				System.out.println(i);
				continue;
			}
		}
	

	}

}
