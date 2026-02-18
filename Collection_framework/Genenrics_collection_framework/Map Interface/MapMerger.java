import java.util.*;

public class MapMerger {

    public static <K> Map<K, Integer> mergeMaps(Map<K, Integer> map1, Map<K, Integer> map2) {
        Map<K, Integer> merged = new HashMap<>(map1);
        for (Map.Entry<K, Integer> entry : map2.entrySet()) {
            merged.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        System.out.print("Enter number of entries in Map1: ");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = Integer.parseInt(sc.nextLine());
            map1.put(key, value);
        }

        System.out.print("Enter number of entries in Map2: ");
        int n2 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = Integer.parseInt(sc.nextLine());
            map2.put(key, value);
        }

        Map<String, Integer> merged = mergeMaps(map1, map2);
        System.out.println("Merged Map: " + merged);
    }
}
