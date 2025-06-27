package OOPS;
import java.util.*;

public class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            System.out.println("Enter product name: ");
            String name = sc.nextLine();

            System.out.println("Enter product price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            products[i] = new Product(name, price);
        }

        System.out.println("\n---All Product Details:---");
        for (Product p : products) {
            p.displayProductDetails();
            System.out.println();
        }

        Product.displayTotalProducts();
        sc.close();
    }
}
