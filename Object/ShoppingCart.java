import java.util.*;
public class ShoppingCart {
	CartItem[] cart;
	int count=0;
	
	public ShoppingCart(int size) {
        cart = new CartItem[size];
	}
    public void addItem(CartItem item) {
        if (count < cart.length) {
            cart[count] = item;
            System.out.println(item.name + " added to cart.");
            count++;
        } else {
            System.out.println("Cart is full.");
        }
    }
    public void removeItem(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (cart[i].name.equalsIgnoreCase(name)) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[count - 1] = null;
                count--;
                System.out.println(name + " removed from cart.");
                break;
            }
        }
        if (!found) {
            System.out.println(name + " not found in cart.");
        }
    }
    public void showCart() {
        if (count == 0) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("\nItems in Cart:");
            for (int i = 0; i < count; i++) {
                cart[i].display();
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Enter cart size: ");
        int cartSize = sc.nextInt();
        sc.nextLine();
        ShoppingCart item = new ShoppingCart(cartSize);

        do {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Show Cart\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    item.addItem(new CartItem(name, price, qty));
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    item.removeItem(removeName);
                    break;
                case 3:
                    item.showCart();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
	}
}

