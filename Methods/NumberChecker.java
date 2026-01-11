import java.util.*;
public class NumberChecker {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = sc.nextInt();
	int res= numberchecker(num);
	if (res == -1)
        System.out.println("The given number is negative.");
    else if (res == 1)
        System.out.println("The given number is positive.");
    else
        System.out.println("The given number is zero.");
}
	public static int numberchecker(int num) {
		if(num<0) {
			return -1;
		}
		else if(num>0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}