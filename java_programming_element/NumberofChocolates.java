import java.util.*;
public class NumberofChocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int numberofChocolates =sc.nextInt();
		int numberofChildren = sc.nextInt();
		int distributed = numberofChocolates / numberofChildren;
		int remaining = numberofChocolates % numberofChildren;
		System.out.print(" The number of Chocolates each children gets is " + distributed + " and the remaining chocolates is " + remaining);
		sc.close();

	}

}
