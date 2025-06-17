import java.util.*;
public class ArrayOutIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of names: ");
		int n =sc.nextInt();
		String[] names = new String[n];
		for(int i =0;i<names.length;i++) {
			names[i]=sc.next();
		}
		handleException(names);

	}
	public static void generateException(String[] arr) {
		System.out.println("Genearting Exception..");
		System.out.println("Names: "+arr[arr.length]);
	}
	public static void handleException(String[] arr) {
		try {
			System.out.println(" Name at index:"+arr[arr.length]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured "+e.getMessage());
			
		}
		catch (RuntimeException e) {
			System.out.println("RuntimeException Occured "+e.getMessage());
		}
	}

}
