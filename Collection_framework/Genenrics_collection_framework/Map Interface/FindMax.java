import java.util.*;

public class FindMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (String): ");
            String key = sc.nextLine();
            System.out.print("Enter value (Integer): ");
            int value = sc.nextInt();
            sc.nextLine();
            map.put(key, value);
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Key with highest value: " + maxKey);
    }
}