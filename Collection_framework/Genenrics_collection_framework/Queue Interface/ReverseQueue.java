import java.util.*;

public class ReverseQueue<T> {

    public Queue<T> reverse(Queue<T> queue) {
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseQueue<Integer> reverser = new ReverseQueue<>();

        System.out.println("Enter space-separated integers:");
        String[] input = sc.nextLine().split(" ");
        Queue<Integer> queue = new LinkedList<>();

        for (String s : input) {
            queue.add(Integer.parseInt(s));
        }

        System.out.println("Reversed Queue: " + reverser.reverse(queue));
    }
}
