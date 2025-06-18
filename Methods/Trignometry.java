import java.util.*;
public class Trignometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of angles: ");
		 double angle = sc.nextDouble();

		 double[] results = calculateTrigonometricFunctions(angle);

		 System.out.println("Sine: " + results[0]);
		 System.out.println("Cosine: " + results[1]);
		 System.out.println("Tangent: " + results[2]);
	}
     public static double[] calculateTrigonometricFunctions(double angle) {
		        double radians = Math.toRadians(angle);

		        double sin = Math.sin(radians);
		        double cos = Math.cos(radians);
		        double tan = Math.tan(radians);

		        return new double[] { sin, cos, tan };
		    }

}
