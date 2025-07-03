package OOPS;
import java.util.*;
interface Discountable{
	double applyDiscount();
	String getDiscountDetails();
}
abstract class FoodItem{
	private String ItemName;
	private double price;
	private int quantity;
	FoodItem(String ItemName,double price,int quantity){
		this.ItemName=ItemName;
		this.price=price;
		this.quantity=quantity;
	}
	public String ItemName() {
	return ItemName;
	}
	public double price() {
		return price;
	}
	public int quantity() {
		return quantity;
	}
	public void getItemDetails() {
		System.out.println("Item: " + ItemName + ", Price: ₹" + price + ", Quantity: " + quantity);
	}
	public abstract double calculateTotalPrice();
}
//Veg Item
class VegItem extends FoodItem implements Discountable{
	public VegItem(String ItemName, double price, int quantity) {
	super(ItemName,price,quantity);
	}
	public double calculateTotalPrice() {
		return price()*quantity();
	}
	public double applyDiscount() {
		return calculateTotalPrice() *0.10;
	}
	public String getDiscountDetails() {
		return "Veg Item Discount: 10%";
	}
}
//Non -veg
class NonVegItem extends FoodItem implements Discountable{
	public NonVegItem(String ItemName, double price, int quantity) {
	super(ItemName,price,quantity);
	}
	public double calculateTotalPrice() {
		double baseTotal= price()*quantity();
		double extraCharge= baseTotal *0.15;
		return baseTotal+extraCharge;
	}
	public double applyDiscount() {
		return calculateTotalPrice() *0.05;
	}
	public String getDiscountDetails() {
		return "Non-Veg Item Discount: 5%";
	}
}
public class OnlineFoodMnagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        List<FoodItem> order = new ArrayList<>();

        System.out.print("Enter number of food items to order: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Item " + (i + 1));
            System.out.print("Enter type (Veg/NonVeg): ");
            String type = sc.nextLine();

            System.out.print("Enter item name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            if (type.equalsIgnoreCase("Veg")) {
                order.add(new VegItem(name, price, qty));
            } else if (type.equalsIgnoreCase("NonVeg")) {
                order.add(new NonVegItem(name, price, qty));
            } else {
                System.out.println("Invalid item type. Skipping...");
            }
        }

        // Display Bill
        System.out.println("\n======= Final Bill =======");
        double grandTotal = 0;
        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice = total - discount;
            System.out.printf("Total: ₹%.2f, Discount: ₹%.2f, Final: ₹%.2f\n", total, discount, finalPrice);
            grandTotal += finalPrice;

            System.out.println("---------------------------");
        }

        System.out.printf("Grand Total: ₹%.2f\n", grandTotal);

	}

}
