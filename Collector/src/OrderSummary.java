import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double total;

    Order(String customer, double total) {
        this.customer = customer;
        this.total = total;
    }

    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}

public class OrderSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Order> orders = new ArrayList<>();

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name: ");
            String customer = sc.nextLine();
            System.out.print("Enter order total: ");
            double total = sc.nextDouble();
            sc.nextLine();
            orders.add(new Order(customer, total));
        }

        Map<String, Double> revenue = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer,
                    Collectors.summingDouble(Order::getTotal)));

        System.out.println("Revenue Summary: " + revenue);
    }
}
