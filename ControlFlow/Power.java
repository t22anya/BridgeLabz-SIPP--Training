import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int pow = sc.nextInt();
		int res = 1;
		for(int i =1;i<=pow ;i++) {
			res*=n;
			
		}
		System.out.println( res);

	}

}
