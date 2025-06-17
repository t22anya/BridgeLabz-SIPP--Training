import java.util.*;
public class ReturnCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String inp= sc.next();
		char[] manual= getchar(inp);
		char[] builtin = inp.toCharArray();
		boolean isSame = compareCharArray(manual,builtin);
		System.out.println("Characters using user-defined method: " + Arrays.toString(manual));
        System.out.println("Characters using built-in method:     " + Arrays.toString(builtin));
        System.out.println("Are both arrays equal? " + isSame);
		
		
	}
	public static char[] getchar(String inp) {
		char []res = new char[inp.length()];
		for(int i =0;i<inp.length();i++) {
			res[i]=inp.charAt(i);
		}
		return res;
	}
	public static boolean compareCharArray(char[]arr1,char[]arr2) {
		if(arr1.length !=arr2.length) {
			return false;
		}
		for(int i =0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
