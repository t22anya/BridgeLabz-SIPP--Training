import java.util.*;
public class FriendsAgeComparsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Amar's age: ");
		int Amarage = sc.nextInt();
		System.out.println(" Enter Akbar's age: ");
		int Akbarage = sc.nextInt();
		System.out.println(" Enter Anthony's age: ");
		int Anthonyage = sc.nextInt();
		System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = sc.nextInt();


        String youngest;
        if (Amarage<= Akbarage && Amarage <= Anthonyage) {
            youngest = "Amar";
        } else if (Akbarage <= Amarage && Akbarage <= Anthonyage) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        
        System.out.println("\nThe youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);


	}

}
