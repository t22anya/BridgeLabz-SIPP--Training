package OOPS;

public class PostGraduateStudent extends Student {
	private String specialization;
	public PostGraduateStudent(int rollnumber,String name,double CGPA,String specialization) {
		super(rollnumber,name,CGPA);
		this.specialization=specialization;
	}
	public void showDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll No: " + rollnumber);
        System.out.println("Name (from protected): " + name);
        System.out.println("Specialization: " + specialization);

	}
	

}
