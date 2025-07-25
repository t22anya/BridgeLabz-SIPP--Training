import java.util.*;

public class WordFrequency {
    public static <K> Map<K, Integer> countFrequency(List<K> items) {
        Map<K, Integer> freqMap = new HashMap<>();
        for (K item : items) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }
        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String[] words = sc.nextLine().toLowerCase().replaceAll("[^a-z ]", "").split(" ");
        List<String> wordList = Arrays.asList(words);

        Map<String, Integer> frequency = countFrequency(wordList);
        System.out.println("Word Frequencies: " + frequency);
    }
}
