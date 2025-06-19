import java.util.*;
public class numberOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int handshake = (numberOfStudents*(numberOfStudents-1))/2;
		System.out.println("Maximum numbers of handshakes : " + handshake);
		sc.close();


	}

}
