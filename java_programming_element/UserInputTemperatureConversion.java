import java.util.*;
public class UserInputTemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int fahrenhite = sc.nextInt();
		int celsius = (fahrenhite - 32) * 5/9;
		System.out.println(" The " + fahrenhite + " fahrenhite is " + celsius + " celsius .");
		sc.close();
		
		
	}

}
