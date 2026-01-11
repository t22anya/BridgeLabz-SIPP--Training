import java.util.Scanner;
public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String inp = sc.next();
		handleException(inp);
		

	}
	public static  void generateException(String inp) {
		System.out.println("Geneating Exception..");
		int n = Integer.parseInt(inp);
		System.out.println("Parsed number is :"+n);
	}
	public static void handleException(String inp) {
		 System.out.println("Handling exception...");
	        try {
	            int n = Integer.parseInt(inp);
	            System.out.println("Parsed number is: " + n);
	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormatException occurred: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("Generic RuntimeException occurred: " + e.getMessage());
	        }
	    
	}
}
