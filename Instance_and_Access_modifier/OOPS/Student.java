package OOPS;
import java.util.*;
public class Student {
	public int rollnumber;
	protected String name;
	private double CGPA;
	public Student(int rollnumber,String name,double CGPA) {
		this.rollnumber = rollnumber;
		this.name=name;
		this.CGPA=CGPA;
	}
	public double getCGPA() {
		return CGPA;
	}
	public void setCGPA(double CGPA) {
		this.CGPA=CGPA;
	}
	public void display() {
		System.out.println("Roll number: "+rollnumber);
		System.out.println("Name: "+name);
		System.out.println("CGPA: "+CGPA);
	}
}
