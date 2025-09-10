import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Item {
    private String name;
    private String category;
    private double price;

    public Item(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " (" + category + " $" + price + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Order {
    private LocalDate orderDate;
    private List<Item> items;
    public Order(LocalDate orderDate, List<Item> items) {
        this.orderDate = orderDate;
        this.items = items;
    }
    public LocalDate getOrderDate() { return orderDate; }
    public List<Item> getItems() { return items; }
}

public class SalesDashboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input lena
        System.out.print("Customer Name :");
        String custName = sc.nextLine();

        System.out.print("How much Products does customer order?: ");
        int orderCount = sc.nextInt();
        sc.nextLine();

        List<Order> orders = new ArrayList<>();

        for (int o = 0; o < orderCount; o++) {
            System.out.print("Order " + (o + 1) + " have how many items?: ");
            int itemCount = sc.nextInt();
            sc.nextLine();

            List<Item> items = new ArrayList<>();
            for (int i = 0; i < itemCount; i++) {
                System.out.print("Item Name: ");
                String name = sc.nextLine();
                System.out.print("Category: ");
                String cat = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                items.add(new Item(name, cat, price));
            }

            // Order ka date random 0–90 din purana
            LocalDate date = LocalDate.now().minusDays(new Random().nextInt(90));
            orders.add(new Order(date, items));
        }

        LocalDate sixtyDaysAgo = LocalDate.now().minusDays(60);

        // Stream pipeline
        List<Item> topAffordablePicks = Stream.of(orders)
            .filter(oList -> oList.stream()
                                  .filter(o -> o.getOrderDate().isAfter(sixtyDaysAgo))
                                  .count() >= 3) // kam se kam 3 orders 60 din me
            .flatMap(oList -> oList.stream().flatMap(o -> o.getItems().stream()))
            .distinct()
            .sorted(Comparator.comparingDouble(Item::getPrice).reversed())
            .peek(i -> System.out.println(i.getName() + " : $" + i.getPrice()))
            .skip(2)
            .limit(10)
            .collect(Collectors.toList());

        Map<String, List<Item>> groupedByCategory =
            topAffordablePicks.stream().collect(Collectors.groupingBy(Item::getCategory));

        long electronicsCount = groupedByCategory.getOrDefault("Electronics", List.of()).size();
        boolean anyAbove500 = topAffordablePicks.stream().anyMatch(i -> i.getPrice() > 500);
        boolean allAbove10 = topAffordablePicks.stream().allMatch(i -> i.getPrice() > 10);
        boolean noEmptyNames = topAffordablePicks.stream().noneMatch(i -> i.getName() == null || i.getName().isBlank());
        Optional<Item> firstHomeAppliance = groupedByCategory.getOrDefault("Home Appliances", List.of()).stream().findFirst();
        Optional<Item> anyFitness = groupedByCategory.getOrDefault("Fitness", List.of()).stream().findAny();
        double totalValue = topAffordablePicks.stream().map(Item::getPrice).reduce(0.0, Double::sum);

        // Output
        System.out.println("\nGrouped Items: " + groupedByCategory);
        System.out.println("Electronics Count: " + electronicsCount);
        System.out.println("Any above 500? " + anyAbove500);
        System.out.println("All above 10? " + allAbove10);
        System.out.println("No empty names? " + noEmptyNames);
        System.out.println("First Home Appliance: " + firstHomeAppliance);
        System.out.println("Any Fitness Item: " + anyFitness);
        System.out.println("Total Value: $" + totalValue);
    }
}
