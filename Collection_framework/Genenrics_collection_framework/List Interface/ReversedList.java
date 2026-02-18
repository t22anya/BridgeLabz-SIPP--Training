import java.util.*;

public class ReversedList<T> {

    public List<T> reverse(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++; right--;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReversedList<String> reverser = new ReversedList<>();

        System.out.println("Enter space-separated elements:");
        String[] input = sc.nextLine().split(" ");

        List<String> arrayList = new ArrayList<>(Arrays.asList(input));
        List<String> linkedList = new LinkedList<>(Arrays.asList(input));

        System.out.println("Reversed ArrayList: " + reverser.reverse(arrayList));
        System.out.println("Reversed LinkedList: " + reverser.reverse(linkedList));
    }
}
