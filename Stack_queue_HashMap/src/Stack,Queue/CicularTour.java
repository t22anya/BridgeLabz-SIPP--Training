import java.util.*;

public class CicularTour {

    public static int findStartingPump(int[] petrolAtPump, int[] distanceToNext, int totalPumps) {
        int startPump = 0;
        int currentFuel = 0;
        int fuelDeficit = 0;

        for (int i = 0; i < totalPumps; i++) {
            currentFuel += petrolAtPump[i] - distanceToNext[i];

            if (currentFuel < 0) {
                fuelDeficit += currentFuel;
                startPump = i + 1;
                currentFuel = 0;
            }
        }

        if (currentFuel + fuelDeficit >= 0) {
            return startPump;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int totalPumps = input.nextInt();

        int[] petrolAtPump = new int[totalPumps];
        int[] distanceToNext = new int[totalPumps];

        System.out.println("Enter petrol and distance to next pump for each:");

        for (int i = 0; i < totalPumps; i++) {
            System.out.print("Pump " + i + " petrol: ");
            petrolAtPump[i] = input.nextInt();
            System.out.print("Pump " + i + " distance to next: ");
            distanceToNext[i] = input.nextInt();
        }

        int result = findStartingPump(petrolAtPump, distanceToNext, totalPumps);

        if (result != -1) {
            System.out.println("You can start the tour from pump: " + result);
        } else {
            System.out.println("No possible circular tour.");
        }
    }
}
