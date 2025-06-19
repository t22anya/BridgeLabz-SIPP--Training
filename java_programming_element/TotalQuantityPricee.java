import java.util.*;
public class TotalQuantityPricee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int unitprices= sc.nextInt();
		int quantity = sc.nextInt();
		int totalPrices =unitprices * quantity ;
		System.out.println(" The total purchase is INR " + totalPrices + " if the quantity is " + quantity +" and the unit price is INR " + unitprices);
		sc.close();

	}

}
