import java.util.*;

public class Voting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateRandomAges(n);
        String[][] votingStatus = checkVotingEligibility(ages);

        displayResult(votingStatus);
    }

    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";  
            } else {
                result[i][1] = "false"; 
            }
        }

        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.println("\nAge\tCan Vote");
        System.out.println("------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}
