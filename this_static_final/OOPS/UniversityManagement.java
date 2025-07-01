package OOPS;
import java.util.*;
public class UniversityManagement {
	private static String UniversityName;
	private static int TotalStudents;
	private String name;
	private final int rollnumber;
	private char grade;
	public UniversityManagement(String name,int rollnumber,char grade) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.grade=grade;
	}
	public static void displayTotalStudent() {
		 System.out.println("Total Students Enrolled: " + TotalStudents);
	}
	public void updateGrade(char newgrade) {
		this.grade=newgrade;
	}
	 public void displayDetails() {
	        System.out.println("University: " + UniversityName);
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollnumber);
	        System.out.println("Grade: " + grade);
	    }
	 public static void setUniversityName(String name) {
	        UniversityName = name;
	    }
	 public static String getUniversityName() {
	        return UniversityName;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Set university name
        System.out.print("Enter University Name: ");
        String uniName = sc.nextLine();
        UniversityManagement.setUniversityName(uniName);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<UniversityManagement> studentList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for student " + i + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            System.out.print("Grade: ");
            char grade = sc.next().charAt(0);
            sc.nextLine(); // consume newline

            UniversityManagement s = new UniversityManagement(name, roll, grade);
            studentList.add(s);
        }

        // Display details if instance of Student
        for (Object obj : studentList) {
            if (obj instanceof UniversityManagement) {
            	UniversityManagement s = (UniversityManagement) obj;
                System.out.println("\n--- Student Details ---");
                s.displayDetails();
            }
        }

        // Display total student count
        UniversityManagement.displayTotalStudent();


	}

}
