import java.util.*;
public class EqualString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		boolean res = compareUsingCharAt(s1,s2);
		boolean compare= s1.equals(s2);
		System.out.println("\nCompare string using charAt: "+res);
		System.out.println("Compare String using Equals method: "+compare);
		if(res == compare) {
			System.out.println("Both method return the same result.");
		}
		else {
			System.out.println("No both didn't return the same result.");
		}
		
		

	}
	public static boolean compareUsingCharAt(String str1 , String str2) {
		if(str1.length() !=str2.length()) {
			return false;
		}
		for(int i =0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}
