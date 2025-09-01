import java.util.*;

public class Find {
    public static <K> K getMaxKey(Map<K, Integer> map) {
        K maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<K, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("A", 10);
        scores.put("B", 20);
        scores.put("C", 15);

        System.out.println("Key with highest value: " + getMaxKey(scores));
    }
}
