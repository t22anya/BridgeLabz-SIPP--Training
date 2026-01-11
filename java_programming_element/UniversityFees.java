
public class UniversityFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fees =125000;
		int discountPercent =10;
		int discount =(fees* discountPercent)/100;
		int totalfees = fees - discount;
		System.out.println("The discounted amount in INR " + discount + " and Fees you have to pay " + totalfees );

	}

}
