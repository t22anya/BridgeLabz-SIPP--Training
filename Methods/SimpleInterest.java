import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        double result = simpleinterest(principal, rate, time);
        System.out.println(result);
    }

    public static double simpleinterest(int principal, int rate, int time) {
        double si = (principal * rate * time) / 100.0;
        return si;
    }
}
