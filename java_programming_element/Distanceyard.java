import java.util.*;
public class Distanceyard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int distanceInFeets = sc.nextInt();
		int yards = distanceInFeets / 3;
		double  mile =   yards / 1760;
		System.out.println( " The distance in yards is " + yards + " while the distance in miles is " +String.format("%.4f", mile));
		sc.close();
		

	}

}
