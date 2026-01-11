import java.util.*;
public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		handleException();

	}
	public static void generateException() {
		System.out.println("Generatin Exception..");
		String str = null;
		System.out.println("Length of text : "+str.length());
	}
	public static void handleException() {
		String str =null;
		try {
			System.out.println("Trying to access length..");
			int len = str.length();
			System.out.println("length of an input: "+len);
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException occured " +e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException occured "+e.getMessage());
		}
	}
}
 