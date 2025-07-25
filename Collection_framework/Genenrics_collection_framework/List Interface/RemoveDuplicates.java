import java.util.*;

public class RemoveDuplicates<T> {

    public List<T> removeDup(List<T> list) {
        Set<T> seen = new LinkedHashSet<>(list);
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveDuplicates<String> remover = new RemoveDuplicates<>();

        System.out.println("Enter elements:");
        String[] input = sc.nextLine().split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(input));

        System.out.println("List without duplicates: " + remover.removeDup(list));
    }
}
