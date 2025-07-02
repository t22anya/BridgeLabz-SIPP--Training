package OOPS;

import java.util.*;

public class SchoolSystemTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Teacher input
        System.out.println("Enter Teacher Details:");
        System.out.print("Name: ");
        String tName = sc.nextLine();
        System.out.print("Age: ");
        int tAge = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Subject: ");
        String subject = sc.nextLine();
        Persons teacher = new Teacher(tName, tAge, subject);

        // Student input
        System.out.println("\nEnter Student Details:");
        System.out.print("Name: ");
        String sName = sc.nextLine();
        System.out.print("Age: ");
        int sAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Grade: ");
        String grade = sc.nextLine();
        Persons student = new Student(sName, sAge, grade);

        // Staff input
        System.out.println("\nEnter Staff Details:");
        System.out.print("Name: ");
        String stName = sc.nextLine();
        System.out.print("Age: ");
        int stAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        Persons staff = new Staff(stName, stAge, dept);

        // Display Roles
        System.out.println("\n--- School Roles ---");
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();

        sc.close();
    }
}

// Superclass
class Persons {
    protected String name;
    protected int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Generic Person");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Persons{
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("\nRole: Teacher");
        super.displayRole();
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Persons {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("\nRole: Student");
        super.displayRole();
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Persons {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("\nRole: Staff");
        super.displayRole();
        System.out.println("Department: " + department);
    }
}
