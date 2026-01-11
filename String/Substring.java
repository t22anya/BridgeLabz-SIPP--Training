import java.util.*;
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1 = sc.nextLine().trim();
		int start=sc.nextInt();
		int end = sc.nextInt();
		String sub1= createSubstringUsingCharAt(str1,start,end);
		String sub2 = "";
		if(start>=0 && end<=str1.length() && start<end) {
			sub2 = str1.substring(start,end);
		}
		else {
			System.out.println("Invalid range for built in substring");
		}
		boolean isEqual = compareUsingCharAt(sub1,sub2);
		System.out.println("\n substring using CharAt(): "+sub1);
		System.out.println("Substring using substirng(): "+sub2);
		System.out.println("Are both substring equal? "+isEqual);


	
	
	}
	public static String createSubstringUsingCharAt(String str1,int start,int end) {
		String res ="";
		for(int i = start;i<end && i<str1.length();i++) {
			res+=str1.charAt(i);
		}
		return res;
	}
	public static boolean compareUsingCharAt(String s1,String s2) {
		if(s1.length() !=s2.length()) {
			return false;
			}
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
			
		}
		return true;
		}

}
