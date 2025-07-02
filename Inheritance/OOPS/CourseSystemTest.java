package OOPS;
	import java.util.*;

	public class CourseSystemTest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // User input for PaidOnlineCourse
	        System.out.print("Enter Course Name: ");
	        String courseName = sc.nextLine();

	        System.out.print("Enter Duration (in weeks): ");
	        int duration = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter Platform (e.g., Coursera, Udemy): ");
	        String platform = sc.nextLine();

	        System.out.print("Is the course recorded? (true/false): ");
	        boolean isRecorded = sc.nextBoolean();

	        System.out.print("Enter Course Fee: ");
	        double fee = sc.nextDouble();

	        System.out.print("Enter Discount Percentage: ");
	        double discount = sc.nextDouble();

	        // Create object of PaidOnlineCourse
	        PaidOnlineCourse course = new PaidOnlineCourse(courseName, duration, platform, isRecorded, fee, discount);

	        // Display all course details
	        System.out.println("\n--- Course Details ---");
	        course.displayCourseInfo();

	        sc.close();
	    }
	}

	// Base class
	class Course {
	    protected String courseName;
	    protected int duration;

	    public Course(String courseName, int duration) {
	        this.courseName = courseName;
	        this.duration = duration;
	    }

	    public void displayCourseInfo() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Duration: " + duration + " weeks");
	    }
	}

	// Subclass: OnlineCourse
	class OnlineCourse extends Course {
	    protected String platform;
	    protected boolean isRecorded;

	    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
	        super(courseName, duration);
	        this.platform = platform;
	        this.isRecorded = isRecorded;
	    }

	    @Override
	    public void displayCourseInfo() {
	        super.displayCourseInfo();
	        System.out.println("Platform: " + platform);
	        System.out.println("Is Recorded: " + isRecorded);
	    }
	}

	// Subclass: PaidOnlineCourse
	class PaidOnlineCourse extends OnlineCourse {
	    private double fee;
	    private double discount;

	    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
	        super(courseName, duration, platform, isRecorded);
	        this.fee = fee;
	        this.discount = discount;
	    }

	    @Override
	    public void displayCourseInfo() {
	        super.displayCourseInfo();
	        System.out.println("Course Fee: ₹" + fee);
	        System.out.println("Discount: " + discount + "%");
	        double finalFee = fee - (fee * discount / 100);
	        System.out.println("Final Price after Discount: ₹" + finalFee);
	    }
	}


