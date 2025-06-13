import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a =sc.nextFloat();
		float b = sc.nextFloat();
		float add = a + b;
		float subtract = a -b;
		float multiply = a * b;
        float division = b != 0 ? a / b : 0;

        // Output
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + a + " and " + b + " is "
                + add + ", " + subtract + ", " + multiply + ", and "
                + (b != 0 ? division : "undefined (division by zero)") + ".");

        sc.close();
    }
}

