import java.util.*;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        // Compute total and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        System.out.println("Average percentage: "+percentage);
        if(percentage>=80) {
        	System.out.print("Remarks: Level 4, above agency-normalized standards");
        }
        else if (percentage>=70) {
        	 System.out.println("Remarks: Level 3, at agency-normalized standards");
        } else if (percentage >= 60) {
            System.out.println("Remarks: Level 2, below but approaching agency-normalized standards");
        } else if (percentage >= 50) {
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        } else if (percentage >= 40) {
            System.out.println("Remarks: Level 1-, too below agency-normalized standards");
        } else {
            System.out.println("Remarks: Remedial standards");
        }
	}
}
