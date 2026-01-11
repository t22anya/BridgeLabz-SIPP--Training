import java.util.Scanner;

class Student {
    long roll; // Use long for large roll numbers
    String name;
    Student next;

    Student(long roll, String name) {
        this.roll = roll;
        this.name = name;
        this.next = null;
    }
}

class StudentList {
    Student head = null;

    // Add student at beginning
    void addAtBeginning(long roll, String name) {
        Student newStudent = new Student(roll, name);
        newStudent.next = head;
        head = newStudent;
    }

    // Display all students
    void display() {
        Student temp = head;
        if (temp == null) {
            System.out.println("No records found.");
            return;
        }
        while (temp != null) {
            System.out.println("Roll: " + temp.roll + ", Name: " + temp.name);
            temp = temp.next;
        }
    }
}

public class StudentRecord_SinglyLinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();

        System.out.print("How many students? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number: ");
            long roll = sc.nextLong(); // Accept long input

            sc.nextLine(); // consume newline
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            list.addAtBeginning(roll, name);
        }

        System.out.println("\nStudent Records:");
        list.display();

        sc.close();
    }
}
