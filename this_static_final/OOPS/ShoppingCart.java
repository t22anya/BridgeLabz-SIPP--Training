package OOPS;
import java.util.*;
public class ShoppingCart {
	//static
	private static double discount=0.0;
	private final int ProductID;
	private String productName;
	private  double price;
	private int quantity;
	public static void updateDiscount(double newDiscount) {
		discount=newDiscount;
	}
	public ShoppingCart(int ProductID,String productName,double price,int quantity) {
		this.ProductID=ProductID;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	public void display() {
		System.out.println("Product ID: "+ProductID);
		System.out.println("Name : "+productName);
		System.out.println("Price: "+price);
		System.out.println("Quantity: "+quantity);
		System.out.println("Total price after discount: "+getTotalPrice());
	}
	public double getTotalPrice() {
		double total= price*quantity;
		return (total *discount/100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dicount percentage: ");
		double discountinp=sc.nextDouble();
		ShoppingCart.updateDiscount(discountinp);
		sc.nextLine();
		  System.out.print("Enter number of products to add: ");
	        int n = sc.nextInt();
	        sc.nextLine();
		List<ShoppingCart> cart = new ArrayList<>();
		for(int i =1;i<=n;i++) {
			System.out.println("Enter details for product "+i+":");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int qty = sc.nextInt();
			sc.nextLine();
			ShoppingCart s= new ShoppingCart(i,name,price,qty);
			cart.add(s);
		}
		for(Object obj:cart) {
			if(obj instanceof ShoppingCart) {
				ShoppingCart p = (ShoppingCart) obj;
				System.out.println("\n--Products details---");
				p.display();
			}
		}

	}

}
