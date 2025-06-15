import java.util.Scanner;

public class LeapYearusingIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        if (year < 1582) {
            System.out.println("Please enter a year from 1582 onwards (Gregorian calendar).");
        } 
        else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } 
        else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year.");
        } 
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } 
        else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
