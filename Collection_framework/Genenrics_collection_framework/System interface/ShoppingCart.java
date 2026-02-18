import java.util.*;

public class ShoppingCart {

    public static <K, V extends Comparable<V>> void displaySortedByPrice(Map<K, V> map) {
        TreeMap<V, K> sortedMap = new TreeMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("\n Items sorted by price:");
        for (Map.Entry<V, K> entry : sortedMap.entrySet()) {
            System.out.println(entry.getValue() + " => " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();
        HashMap<String, Double> priceMap = new HashMap<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String product = sc.nextLine();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            cart.put(product, price);
            priceMap.put(product, price);
        }

        System.out.println("\n Order of items added (LinkedHashMap):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " => ₹" + entry.getValue());
        }

        displaySortedByPrice(priceMap);
    }
}
