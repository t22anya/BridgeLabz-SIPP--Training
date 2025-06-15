import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int year =sc.nextInt();
		if(year>=1582 && ((year%4 ==0) && ((year % 100!=0) || (year%400 ==0)))) {
			System.out.println("The year " +year+ " is a leap year.");
		}
		else if (year <1582) {
			System.out.println("Please enter a year from 1582 onwards(Gregorian calendar).");
		}
		else {
			System.out.println("The year "+year+" is not a leap year.");
		}

	}

}
