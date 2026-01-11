import java.util.*;
public class RocketLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ffrom countdown begin to start:");
		int counter = sc.nextInt();
		while(counter>=1) {
			System.out.println(counter);
			counter--;
		}

		System.out.println("Lift off!");
	}

}
