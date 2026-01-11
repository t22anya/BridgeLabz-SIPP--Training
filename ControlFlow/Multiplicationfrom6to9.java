import java.util.*;
public class Multiplicationfrom6to9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Multiplication table of " + num + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

	}

}
