import java.util.Scanner;

public class UserInputCelsisuToFahrenhite{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cel=sc.nextInt();
		int feh = (cel * 9/5)+32;
		System.out.println(feh);
		sc.close();
	}

}
