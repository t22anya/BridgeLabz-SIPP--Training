import java.util.*;
public class ConvertToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String manual= toUpperCase(str);
		String builtin =str.toUpperCase();
		boolean isSame = compareString(manual,builtin);
		System.out.println("Manual uuppercase :"+manual);
		System.out.println("Built in Uppercase: "+builtin);
		System.out.println("Are both String equal?"+isSame);
	}
	public static String toUpperCase(String str) {
		String res="";
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >='a' && ch<='z') {
				ch=(char)(ch-32);
			}
			res+=ch;
		}
		return res;
		}
	public static boolean compareString(String str1,String str2) {
		if(str1.length()!=str2.length()) {
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
