import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        Set<Integer> seen = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            if (seen.contains(target - num)) {
                System.out.println("Pair found: " + num + " + " + (target - num));
                found = true;
                break;
            }
            seen.add(num);
        }

        if (!found) System.out.println("No pair found.");
    }
}
