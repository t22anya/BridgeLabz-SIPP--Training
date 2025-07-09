import java.util.*;

class CustomMap {
    static class Node {
        int key, value;
        Node next;
        Node(int k, int v) { key = k; value = v; }
    }

    private final int SIZE = 1000;
    private Node[] table = new Node[SIZE];

    private int hash(int key) {
        return Math.abs(key) % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];

        for (Node node = head; node != null; node = node.next) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        Node newNode = new Node(key, value);
        newNode.next = head;
        table[index] = newNode;
    }

    public Integer get(int key) {
        int index = hash(key);
        Node node = table[index];
        while (node != null) {
            if (node.key == key) return node.value;
            node = node.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Node node = table[index];
        Node prev = null;
        while (node != null) {
            if (node.key == key) {
                if (prev == null) table[index] = node.next;
                else prev.next = node.next;
                return;
            }
            prev = node;
            node = node.next;
        }
    }
}

public class HashMapApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomMap map = new CustomMap();
        while (true) {
            System.out.println("1: Put  2: Get  3: Remove  4: Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter key and value: ");
                int k = sc.nextInt(), v = sc.nextInt();
                map.put(k, v);
            } else if (choice == 2) {
                System.out.print("Enter key: ");
                int k = sc.nextInt();
                Integer value = map.get(k);
                System.out.println("Value: " + (value == null ? "Not Found" : value));
            } else if (choice == 3) {
                System.out.print("Enter key: ");
                map.remove(sc.nextInt());
            } else {
                break;
            }
        }
    }
}
