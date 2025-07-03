package OOPS;
import java.util.*;
interface Taxable{
	double calculateTax();
    String getTaxDetails();
}
abstract  class Product{
	private int productId;
	private String name;
	private double price;
	Product(int productId,String name,double price){
		this.productId=productId;
		this.name=name;
		this.price=price;
	}
	public int getProductId() {
		return productId;
	}
	public String getName() { 
		return name; 
		}
    public double getPrice() { 
    	return price; 
    	}

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double calculateDiscount();

    public void displayProduct() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: ₹" + price);
    }
}
class Electronics extends Product implements Taxable{
	private double TaxRate;
	public Electronics(int productId, String name, double price,double TaxRate) {
        super(productId, name, price);
        this.TaxRate=TaxRate;
}
	public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * TaxRate / 100;
    }
    public String getTaxDetails() {
        return "Electronics Tax: " + TaxRate + "% GST";
    }
}
class Clothing extends Product implements Taxable{
	private double taxRate;
	Clothing(int productId,String name,double price,double taxRate){
		super(productId,name,price);
		this.taxRate=taxRate;
	}
	public double calculateDiscount() {
		return getPrice()*0.20;
	}
	public double calculateTax() {
		return getPrice()*taxRate/100;
	}
	public String getTaxDetails() {
		return "Clothing Tax: "+taxRate+"% GST";
	}
}
class Groceries extends Product {
	Groceries(int productId,String name,double price){
		super(productId,name,price);
	}
	public double calculateDiscount() {
		return getPrice()*0.05;
	}
}
public class E_Commerce_Platform {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    List<Product> products = new ArrayList<>();

	    System.out.print("Enter number of products: ");
	    int n = sc.nextInt();
	    sc.nextLine(); // consume leftover newline

	    for (int i = 0; i < n; i++) {
	        System.out.println("\nProduct " + (i + 1));
	        System.out.print("Enter product type (Electronics / Clothing / Groceries): ");
	        String type = sc.nextLine().trim();

	        System.out.print("Enter Product ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter Product Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Product Price: ₹");
	        double price = sc.nextDouble();

	        if (type.equalsIgnoreCase("Electronics") || type.equalsIgnoreCase("Clothing")) {
	            System.out.print("Enter Tax Rate (%): ");
	            double taxRate = sc.nextDouble();
	            sc.nextLine(); // consume newline

	            if (type.equalsIgnoreCase("Electronics")) {
	                products.add(new Electronics(id, name, price, taxRate));
	            } else {
	                products.add(new Clothing(id, name, price, taxRate));
	            }
	        } else if (type.equalsIgnoreCase("Groceries")) {
	            products.add(new Groceries(id, name, price));
	            sc.nextLine(); // consume newline
	        } else {
	            System.out.println("Invalid product type. Skipping...");
	            sc.nextLine(); // consume newline
	        }
	    }

	    // Print Final Prices
	    System.out.println("\n===== Final Billing =====");
	    for (Product p : products) {
	        p.displayProduct();
	        double discount = p.calculateDiscount();
	        double tax = 0;

	        if (p instanceof Taxable) {
	            Taxable t = (Taxable) p;
	            tax = t.calculateTax();
	            System.out.println(t.getTaxDetails());
	        } else {
	            System.out.println("No tax applicable.");
	        }

	        double finalPrice = p.getPrice() + tax - discount;
	        System.out.printf("Discount: ₹%.2f, Tax: ₹%.2f, Final Price: ₹%.2f\n", discount, tax, finalPrice);
	        System.out.println("-------------------------------------");
	    }
	}
}

