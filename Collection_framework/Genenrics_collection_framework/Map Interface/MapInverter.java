import java.util.*;

public class MapInverter {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> inverted = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return inverted;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> original = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (String): ");
            String key = sc.nextLine();
            System.out.print("Enter value (Integer): ");
            int value = sc.nextInt();
            sc.nextLine(); // consume newline
            original.put(key, value);
        }

        Map<Integer, List<String>> inverted = invertMap(original);
        System.out.println("Inverted Map: " + inverted);
    }
}
