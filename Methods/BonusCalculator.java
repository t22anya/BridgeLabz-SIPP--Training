import java.util.Random;

public class BonusCalculator {

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, updatedData);
    }

    public static double[][] generateEmployeeData(int count) {
        double[][] data = new double[count][2];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = 1 + rand.nextInt(10);
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] updated = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            int years = (int) data[i][1];
            double bonus = years > 5 ? oldSalary * 0.05 : oldSalary * 0.02;
            updated[i][0] = bonus;
            updated[i][1] = oldSalary + bonus;
        }
        return updated;
    }

    public static void displaySummary(double[][] oldData, double[][] updatedData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            int years = (int) oldData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];
            System.out.printf("%d\t%.2f\t%d\t%.2f\t%.2f\n", i + 1, oldSalary, years, bonus, newSalary);
            totalOld += oldSalary;
            totalBonus += bonus;
            totalNew += newSalary;
        }
        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }
}
