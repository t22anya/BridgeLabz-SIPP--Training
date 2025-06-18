import java.util.*;
public class WindChillTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temperature: ");
		double temperature = sc.nextDouble();
		System.out.println("Enter the Windspeed: ");
		double windSpeed = sc.nextDouble();
		 double windChill = calculateWindChill(temperature, windSpeed);
	        System.out.println("Wind Chill Temperature: " + windChill);
		
	}
	public static  double calculateWindChill(double temperature,double windSpeed) {
		  return 35.74 + (0.6215 * temperature)
	               - (35.75 * Math.pow(windSpeed, 0.16))
	               + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
	    }
	}
