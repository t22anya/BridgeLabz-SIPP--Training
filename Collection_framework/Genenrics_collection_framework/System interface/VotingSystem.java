import java.util.*;

public class VotingSystem {

    // Generic method to count votes in a LinkedHashMap
    public static <K> Map<K, Integer> countVotes(List<K> votes) {
        Map<K, Integer> voteCount = new LinkedHashMap<>();
        for (K vote : votes) {
            voteCount.put(vote, voteCount.getOrDefault(vote, 0) + 1);
        }
        return voteCount;
    }

    public static <K, V extends Comparable<V>> void displaySorted(Map<K, V> map) {
        TreeMap<K, V> sorted = new TreeMap<>(map);
        for (Map.Entry<K, V> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> votes = new ArrayList<>();
        System.out.print("Enter number of votes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Vote for candidate #" + (i + 1) + ": ");
            String name = sc.nextLine();
            votes.add(name);
        }

        // 1. Count votes using LinkedHashMap (to maintain order)
        Map<String, Integer> linkedVoteCount = countVotes(votes);

        // 2. Store results in HashMap
        Map<String, Integer> hashVoteCount = new HashMap<>(linkedVoteCount);

        // 3. Display results sorted using TreeMap
        System.out.println("\n📊 Vote Results (Sorted by Candidate Name):");
        displaySorted(hashVoteCount);

        // 4. Display order in which votes were received
        System.out.println("\n🕒 Vote Order (LinkedHashMap):");
        for (Map.Entry<String, Integer> entry : linkedVoteCount.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
