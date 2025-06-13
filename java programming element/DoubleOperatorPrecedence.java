import java.util.Scanner;
public class DoubleOperatorPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double res1 =  a+(b*c);
		double res2 = (a*b)+c;
		double res3 = c+(a/b);
		double res4 = (a%b)+c;
		System.out.println(" The results of Double operations :"+ res1 + " " + res2 + " " + res3 + " " + res4);
		
		sc.close();

	}

}
