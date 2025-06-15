import java.util.*;
public class GreatestFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		int greatest =1;
		for(int i = num-1;i>=1;i--) {
			if(num %i ==0) {
				greatest =i;
			
			break;
		}
		}
		System.out.println( greatest);

	}

}
