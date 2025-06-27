package OOPS;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int roll = sc.nextInt();
		sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student CGPA: ");
        double cgpa = sc.nextDouble();
        		Student st = new Student(roll,name,cgpa);
        st.display();
        System.out.print("Enter updated CGPA: ");
        st.setCGPA(sc.nextDouble());
        System.out.println("Updated CGPA: " + st.getCGPA());
        //PostGraduate detail input 
        sc.nextLine(); // consume newline
        System.out.print("Enter PG Student Roll Number: ");
        int pgRoll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter PG Student Name: ");
        String pgName = sc.nextLine();
        System.out.print("Enter PG Student CGPA: ");
        double pgCgpa = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Specialization: ");
        String specialization = sc.nextLine();

        // Create PostgraduateStudent object
        PostGraduateStudent pgStudent = new PostGraduateStudent(pgRoll, pgName, pgCgpa, specialization);
        pgStudent.showDetails();

	}

}
