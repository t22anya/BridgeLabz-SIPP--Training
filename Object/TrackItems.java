import java.util.*;
class TrackItems {
	String ItemName;
	String ItemCode;
	int ItemPrice;
	TrackItems(String ItemName, String ItemCode ,int ItemPrice){
		this.ItemName=ItemName;
		this.ItemCode= ItemCode;
		this.ItemPrice = ItemPrice;
	}
	double CalculateCost(int quantity) {
		return ItemPrice * quantity;
	}
	void displayDetails() {
		System.out.println("\n---- Track Item Inventroy----");
		System.out.println("The name of an item: "+ItemName);
		System.out.println("The Code of an itme: "+ItemCode);
		System.out.println("The price of an item: "+ItemPrice);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of item: ");
		String ItemName = sc.next();
		System.out.println("Enter the code: ");
		String ItemCode = sc.next();
		System.out.println("Enter the price of an item: ");
		int ItemPrice = sc.nextInt();
		 System.out.print("Enter Quantity: ");
	       int quantity = sc.nextInt();
		TrackItems  item = new TrackItems(ItemName,ItemCode,ItemPrice);
		item.displayDetails();
		double totalCost = item.CalculateCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: ₹" + totalCost);

	}

}
