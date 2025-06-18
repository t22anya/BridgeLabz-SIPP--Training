import java.util.*;
public class Handshake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numberOfStudent = sc.nextInt();
		int totalHandshake = HandshakeChecker(numberOfStudent);
		System.out.println("The number of possible handshakes is "+ totalHandshake);
		

	}
	public static int HandshakeChecker(int numberOfStudent) {
		int maximum = (numberOfStudent*(numberOfStudent-1))/2;
		return maximum;
	}

}
