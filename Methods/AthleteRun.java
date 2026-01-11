import java.util.*;
public class AthleteRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side of Triangle: ");
		int side1 =sc.nextInt();
		System.out.println("Enter the second side of Triangle: ");
		int side2 = sc.nextInt();
		System.out.println("Enter the third side of a triangle: ");
		int side3 =sc.nextInt();
		int perimeter = side1+side2+side3;
		int distance =5000;
		int round = numberOfRounds(perimeter,distance);
		System.out.println("The athlete must complete " + round + " rounds to complete a 5 km run.");
    }
		
	public static int numberOfRounds(int perimeter,int distance ) {
		if(perimeter ==0) {
			return 0;
		}
		return (int) Math.ceil((double) distance/perimeter);
}

}
