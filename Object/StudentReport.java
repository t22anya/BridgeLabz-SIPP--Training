import java.util.*;
public class StudentReport {
	String name;
	int rollnumber;
	double marks;
	StudentReport(String name,int rollnumber,double marks){
		this.name = name;
		this.rollnumber = rollnumber;
		this.marks = marks;
	}
	String calculateGrade() {
		if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
	}
	void display() {
		System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();
        StudentReport student = new StudentReport(name, roll, marks);
        student.display();
        

	}

}
