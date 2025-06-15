import java.util.*;
public class Smallesnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1 <  num2 && num1 < num3) {
			System.out.println("Is the first number is smalles? true");
		}
		else {
			System.out.println("Is the first number is smallest? false");
		}
	}

}
