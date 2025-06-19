import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter To City (Destination): ");
        String toCity = sc.nextLine();

        System.out.print("Enter Distance from From City to Via City (in miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter Distance from Via City to To City (in miles): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter Time taken from From City to Via City (in minutes): ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter Time taken from Via City to Final Destination (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity +
                " to " + toCity + " via " + viaCity + " is " +
                String.format("%.2f", totalDistanceKm) + " km and the Total Time taken is " +
                totalTime + " minutes.");
        sc.close();
    }
}
