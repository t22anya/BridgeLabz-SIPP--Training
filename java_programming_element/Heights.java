import java.util.*;
public class Heights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter height in cm: ");
	        double cm = input.nextDouble();
	        double totalInches = cm / 2.54;
	        int feet = (int)(totalInches / 12);
	        double inches = totalInches % 12;


        System.out.println("Your height in cm is " + cm + ", in feet is " + feet + ", and inches is " + inches);

        input.close();
		

	}

}
