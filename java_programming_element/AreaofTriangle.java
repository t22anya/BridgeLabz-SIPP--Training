import java.util.*;
public class AreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
	    double  base =sc.nextDouble();
		double areacm = 0.5 * base * height;
		double areainch = areacm / 6.4516;
		System.out.println(" The area of triangle in sq in is " + areainch + " and  sq cm is " + areacm);
		sc.close();
		

	}

}
