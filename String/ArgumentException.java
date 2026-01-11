import java.util.*;
public class ArgumentException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String inp =sc.nextLine();
		  System.out.print("Enter start index: ");
	        int start = sc.nextInt();
	        System.out.print("Enter end index: ");
	        int end = sc.nextInt();
	        handleException(inp,start,end);
	}
	public static void generateException(String inp,int start,int end) {
		System.out.println("Generating Exception..");
		String sub = inp.substring(start,end);
		System.out.println("SubString: "+sub);
	}
	public static void handleException(String inp,int start,int end) {
		try {
			 String sub = inp.substring(start,end);
			System.out.println("SubString: "+sub);
		}
		catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException occured : "+e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException occured : "+e.getMessage());
		}
	}

}
