import java.util.*;
public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter tbhe month from(1-12):");
		int month = sc.nextInt();
		System.out.println("Enter the date from(1-31):");
		int date = sc.nextInt();
		boolean ans = SeasonChecker(month,date);
		System.out.println("The given month and date is SpringSeason? "+ans);

	}
	public static boolean SeasonChecker(int month,int date) {
		if((month==3 && date>=20 && date<=31)||
				(month ==4 && date>=1 && date<=30)||
				(month ==5 && date >=1 && date<=31)||
				(month == 6 && date >=1 && date<=20)){
			return true;
					
				}
		return false;
	}
}
