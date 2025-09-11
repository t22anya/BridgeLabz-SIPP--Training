import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        String[] words = paragraph.split("\\s+");

        Map<String, Long> frequency = Arrays.stream(words)
            .collect(Collectors.toMap(
                word -> word.toLowerCase(),
                word -> 1L,
                Long::sum
            ));

        System.out.println("Word Frequency: " + frequency);
    }
}
