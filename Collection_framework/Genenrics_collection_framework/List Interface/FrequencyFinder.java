import java.util.*;

public class FrequencyFinder<T> {

    public Map<T, Integer> countFrequency(List<T> list) {
        Map<T, Integer> freqMap = new HashMap<>();
        for (T item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }
        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FrequencyFinder<String> counter = new FrequencyFinder<>();

        System.out.println("Enter strings (space-separated):");
        String[] input = sc.nextLine().split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(input));

        Map<String, Integer> result = counter.countFrequency(list);
        System.out.println("Frequency Map: " + result);
    }
}
