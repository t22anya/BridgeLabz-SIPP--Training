import java.util.*;
public class PowerUsingwhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int pow = sc.nextInt();
		int res =1;
		int temp =0;
		while( temp<pow) {
			res*=num;
			temp++;
		}
		System.out.println(res);

	}

}
