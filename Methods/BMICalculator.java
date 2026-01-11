import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        double[][] data = new double[10][3];
        String[] statuses;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
        statuses = getBMIStatuses(data);

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    data[i][1], data[i][0], data[i][2], statuses[i]);
        }

        sc.close();
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] getBMIStatuses(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal weight";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }
}
