import java.util.*;

public class StudentGrade{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateRandomScores(n);
        double[][] results = calculateStats(marks);
        String[] grades = assignGrades(results);
        displayScoreCard(marks, results, grades);
    }
    public static int[][] generateRandomScores(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = rand.nextInt(41) + 60;  
            marks[i][1] = rand.nextInt(41) + 60; 
            marks[i][2] = rand.nextInt(41) + 60;  
        }

        return marks;
    }

    public static double[][] calculateStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return stats;
    }
    public static String[] assignGrades(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double percent = stats[i][2];
            if (percent >= 90)
                grades[i] = "A";
            else if (percent >= 80)
                grades[i] = "B";
            else if (percent >= 70)
                grades[i] = "C";
            else if (percent >= 60)
                grades[i] = "D";
            else
                grades[i] = "F";
        }

        return grades;
    }

    public static void displayScoreCard(int[][] marks, double[][] stats, String[] grades) {
        System.out.println("\nScorecard:");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-15s%-10s%-10s\n",
            "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-15.2f%-10.2f%-10s\n",
                (i + 1), marks[i][0], marks[i][1], marks[i][2],
                stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }
}
