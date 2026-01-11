import java.util.*;
public class FactorFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=0) {
			System.out.println("Please enter apositive integer");
			return;
		}
		for(int i =1;i<num;i++) {
			if(num %i==0) {
				System.out.println(i);
			}
		}

	}

}
