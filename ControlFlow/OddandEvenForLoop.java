import java.util.*;
public class OddandEvenForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=0) {
			System.out.println("Pleas eenter a valid number ");
			return;
		}
		for(int i =1;i<=num;i++) {
			if(i % 2 ==0) {
				System.out.println(i+ " Even number");
			}
			else {
				System.out.println(i+ " odd nummber");
			}
		
		}
	}

}
