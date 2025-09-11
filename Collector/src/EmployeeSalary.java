import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter department: ");
            String dept = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            employees.add(new Employee(name, dept, salary));
        }

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average Salary by Department: " + avgSalaryByDept);
    }
}
