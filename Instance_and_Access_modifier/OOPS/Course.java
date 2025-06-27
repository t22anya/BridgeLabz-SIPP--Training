package OOPS;
import java.util.*;
public class Course {
	String courseName;
	int duration;
	double fees;
	static String instituteName;
	Course(String courseName,int duration,double fees ){
		this.courseName=courseName;
		this.duration=duration;
		this.fees=fees;
	}
	void displayCourseDetails() {
		 System.out.println("Institute Name: " + instituteName);
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Duration: " + duration + " months");
	        System.out.println("Fee: ₹" + fees);
	}
	public static void updateInstitute(String newName) {
		 instituteName = newName;
	     System.out.println("Institute name updated to: " + instituteName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Institute Name: ");
        String instName = sc.nextLine();
        updateInstitute(instName);

        System.out.print("How many courses you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine();

        Course[] courses = new Course[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for course " + (i + 1) + ":");

            System.out.print("Course Name: ");
            String name = sc.nextLine();

            System.out.print("Duration (in months): ");
            int dur = sc.nextInt();

            System.out.print("Fees: ₹");
            double fee = sc.nextDouble();
            sc.nextLine(); // consume leftover newline

            courses[i] = new Course(name, dur, fee);
        }

        System.out.println("\n--- Course Details ---");
        for (Course c : courses) {
            c.displayCourseDetails();
        }

		
	}

}
