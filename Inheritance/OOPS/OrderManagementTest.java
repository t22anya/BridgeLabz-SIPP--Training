package OOPS;
	import java.util.*;

	public class OrderManagementTest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input for DeliveredOrder
	        System.out.print("Enter Order ID: ");
	        String orderId = sc.nextLine();

	        System.out.print("Enter Order Date (YYYY-MM-DD): ");
	        String orderDate = sc.nextLine();

	        System.out.print("Enter Tracking Number: ");
	        String trackingNumber = sc.nextLine();

	        System.out.print("Enter Delivery Date (YYYY-MM-DD): ");
	        String deliveryDate = sc.nextLine();

	        // Create DeliveredOrder object
	        DeliveredOrder order = new DeliveredOrder(orderId, orderDate, trackingNumber, deliveryDate);

	        // Display status
	        System.out.println("\n--- Order Status ---");
	        System.out.println("Order ID: " + order.orderId);
	        System.out.println("Order Date: " + order.orderDate);
	        System.out.println("Tracking Number: " + order.trackingNumber);
	        System.out.println("Delivery Date: " + order.deliveryDate);
	        System.out.println("Status: " + order.getOrderStatus());

	        sc.close();
	    }
	}

	// Base class
	class Order {
	    protected String orderId;
	    protected String orderDate;

	    public Order(String orderId, String orderDate) {
	        this.orderId = orderId;
	        this.orderDate = orderDate;
	    }

	    public String getOrderStatus() {
	        return "Order Placed";
	    }
	}

	// Subclass: ShippedOrder
	class ShippedOrder extends Order {
	    protected String trackingNumber;

	    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
	        super(orderId, orderDate);
	        this.trackingNumber = trackingNumber;
	    }

	    @Override
	    public String getOrderStatus() {
	        return "Order Shipped";
	    }
	}

	// Subclass: DeliveredOrder (Multilevel)
	class DeliveredOrder extends ShippedOrder {
	    protected String deliveryDate;

	    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
	        super(orderId, orderDate, trackingNumber);
	        this.deliveryDate = deliveryDate;
	    }

	    @Override
	    public String getOrderStatus() {
	        return "Order Delivered";
	    }

}
