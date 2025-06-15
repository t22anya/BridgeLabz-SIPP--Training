import java.util.Scanner;

public class Dayofweek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;

        
        System.out.println("Day of the week (0=Sunday, ..., 6=Saturday): " + d);
    }
}
