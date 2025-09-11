import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public String getGrade() { return grade; }
}

public class StudentGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter grade: ");
            String grade = sc.nextLine();
            students.add(new Student(name, grade));
        }

        Map<String, List<String>> grouped = students.stream()
            .collect(Collectors.groupingBy(Student::getGrade,
                    Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println("Grouped by Grade: " + grouped);
    }
}
