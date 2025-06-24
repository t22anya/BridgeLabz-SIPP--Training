import java.util.*;
public class Palindrome {
	String text;
	Palindrome(String text){
		this.text=text.toLowerCase();
	}
	boolean isPalindrome() {
		int left=0;
		int right =text.length()-1;
		while(left<right) {
			if(text.charAt(left)!=text.charAt(right)) 
				return false;
				left++;
				right--;
			}
			return true;
	}
	void displayResult() {
        if (isPalindrome())
            System.out.println("\"" + text + "\" is a palindrome.");
        else
            System.out.println("\"" + text + "\" is not a palindrome.");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 System.out.print("Enter text: ");
		String text =sc.nextLine();
		Palindrome pc = new Palindrome(text);
        pc.displayResult();

	}

}
