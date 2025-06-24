public class CartItem {
    public String name;
    public double price;
    public int qty;

    public CartItem(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public void display() {
        System.out.println(name + " | Price: " + price + " | Qty: " + qty + " | Total: " + total());
    }

    public double total() {
        return price * qty;
    }
}
