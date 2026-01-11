import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: month and day
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter date: ");
        int date = sc.nextInt();

        boolean isSpring = false;

      
        if ((month == 3 && date >= 20 && date <= 31) || 
            (month == 4 && date >= 1 && date <= 30) || 
            (month == 5 && date >= 1 && date <= 31) || 
            (month == 6 && date >= 1 && date <= 20)) {
            isSpring = true;
        }

        
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}
