import java.util.*;
public class PoundTokilogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter weight in punds: ");
		double weight = sc.nextDouble();
		double kg = weight / 2.2 ;
		System.out.println( " The weight of the person in pound is " + weight + " and in kilogram is "  + kg);
		sc.close();
		

	}

}
