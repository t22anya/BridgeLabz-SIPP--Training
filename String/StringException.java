import java.util.*;
public class StringException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String inp = sc.nextLine();
		handleException(inp);

	}
	public static void generateException(String inp) {
		System.out.println("Generating exception");
		char ch = inp.charAt(inp.length());
		System.out.println("Character of position "+inp.length()+"is: "+ch);
	}
	public static void handleException(String inp) {
		System.out.println("Handling exception");
		try {
			char ch = inp.charAt(inp.length());
			System.out.println("Character at position "+inp.length()+"is :"+ch);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException occured: "+e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("some other RuntimeException: "+e.getMessage());
		}
	}

}
