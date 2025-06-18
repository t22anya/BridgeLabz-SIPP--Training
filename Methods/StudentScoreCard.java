import java.util.Scanner;
import java.util.Random;

public class StudentScoreCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] results = calculateScores(marks);
        displayScorecard(marks, results);
        sc.close();
    }

    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 40 + rand.nextInt(60);
            scores[i][1] = 40 + rand.nextInt(60);
            scores[i][2] = 40 + rand.nextInt(60);
        }
        return scores;
    }

    public static double[][] calculateScores(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double perc = total / 3.0;
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return result;
    }

    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Stu\tPhysics\tChem\tMaths\tTotal\tAvg\t%");

        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t");
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
            System.out.println();
        }
    }
}
