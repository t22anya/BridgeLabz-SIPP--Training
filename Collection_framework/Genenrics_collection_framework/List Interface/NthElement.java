import java.util.*;

public class NthElement<T> {

    public T getNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) fast.next();
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NthElement<String> finder = new NthElement<>();

        System.out.println("Enter elements:");
        String[] input = sc.nextLine().split(" ");
        LinkedList<String> list = new LinkedList<>(Arrays.asList(input));

        System.out.print("Enter N (from end): ");
        int n = sc.nextInt();

        System.out.println("Nth from end: " + finder.getNthFromEnd(list, n));
    }
}
