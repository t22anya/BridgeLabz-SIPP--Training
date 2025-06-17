import java.util.*;

public class RockpaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();

        String[] userChoices = new String[totalGames];
        String[] computerChoices = new String[totalGames];
        String[] results = new String[totalGames];

        int userWins = 0, computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();

            String computerChoice = getComputerChoice();

            String result = getWinner(userChoice, computerChoice);
            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) computerWins++;

            userChoices[i] = userChoice;
            computerChoices[i] = computerChoice;
            results[i] = result;
        }

        String[][] stats = calculateStats(userWins, computerWins, totalGames);
        displayResults(userChoices, computerChoices, results, stats);
    }

    public static String getComputerChoice() {
        int rand = (int)(Math.random() * 3);
        if (rand == 0) return "rock";
        else if (rand == 1) return "paper";
        else return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) 
        	return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[1][0] = "Computer";

        stats[0][1] = String.valueOf(userWins);
        stats[1][1] = String.valueOf(computerWins);

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;

        stats[0][2] = String.format("%.2f", userPercent) + "%";
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }

    public static void displayResults(String[] userChoices, String[] computerChoices, String[] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s%-15s%-15s%-10s\n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < userChoices.length; i++) {
            System.out.printf("%-10d%-15s%-15s%-10s\n", (i + 1), userChoices[i], computerChoices[i], results[i]);
        }

        System.out.println("\nOverall Statistics:");
        System.out.printf("%-10s%-10s%-15s\n", "Player", "Wins", "Win %");
        System.out.println("------------------------------------");

        for (String[] row : stats) {
            System.out.printf("%-10s%-10s%-15s\n", row[0], row[1], row[2]);
        }
    }
}
