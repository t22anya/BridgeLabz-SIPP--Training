import java.util.*;
public class UserInputConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double km =sc.nextDouble();
		double miles =(double) km / 1.6;
		System.out.println(" The total mile is "+ miles +  " for the given km " +  km);
		sc.close();
		

	}

}
