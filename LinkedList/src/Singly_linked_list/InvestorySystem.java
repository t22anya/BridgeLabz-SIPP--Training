import java.util.Scanner;

class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    Item head = null;
    Scanner sc = new Scanner(System.in);

    public void addAtBeginning() {
        Item newItem = getItemDetails();
        newItem.next = head;
        head = newItem;
        System.out.println("Item added at beginning.");
    }

    public void addAtEnd() {
        Item newItem = getItemDetails();
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newItem;
        }
        System.out.println("Item added at end.");
    }

    public void addAtPosition(int pos) {
        if (pos <= 1) {
            addAtBeginning();
            return;
        }
        Item newItem = getItemDetails();
        Item temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            addAtEnd();
            return;
        }
        newItem.next = temp.next;
        temp.next = newItem;
        System.out.println("Item added at position " + pos);
    }

    public void removeById(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.id == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next == null) {
            System.out.println("Item not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        }
    }

    public void updateQuantity(int id) {
        Item temp = head;
        while (temp != null && temp.id != id) temp = temp.next;
        if (temp == null) {
            System.out.println("Item not found.");
        } else {
            System.out.print("Enter new quantity: ");
            temp.quantity = sc.nextInt();
            System.out.println("Quantity updated.");
        }
    }

    public void searchItem() {
        System.out.print("Search by (1) ID or (2) Name: ");
        int choice = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        if (choice == 1) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            Item temp = head;
            while (temp != null) {
                if (temp.id == id) {
                    printItem(temp);
                    found = true;
                    break;
                }
                temp = temp.next;
            }
        } else if (choice == 2) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            Item temp = head;
            while (temp != null) {
                if (temp.name.equalsIgnoreCase(name)) {
                    printItem(temp);
                    found = true;
                }
                temp = temp.next;
            }
        }
        if (!found) System.out.println("Item not found.");
    }

    public void calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    public void sortInventory(int choice, boolean ascending) {
        head = mergeSort(head, choice, ascending);
        System.out.println("Inventory sorted.");
    }

    private Item mergeSort(Item head, int choice, boolean asc) {
        if (head == null || head.next == null) return head;

        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, choice, asc);
        Item right = mergeSort(nextOfMiddle, choice, asc);

        return sortedMerge(left, right, choice, asc);
    }

    private Item sortedMerge(Item a, Item b, int choice, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        Item result;
        int comp;
        if (choice == 1) {
            comp = a.name.compareToIgnoreCase(b.name);
        } else {
            comp = Double.compare(a.price, b.price);
        }

        if ((asc && comp <= 0) || (!asc && comp > 0)) {
            result = a;
            result.next = sortedMerge(a.next, b, choice, asc);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, choice, asc);
        }
        return result;
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void display() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\n--- Inventory Items ---");
        Item temp = head;
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    private Item getItemDetails() {
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // clear buffer
        return new Item(name, id, qty, price);
    }

    private void printItem(Item item) {
        System.out.println("ID: " + item.id + ", Name: " + item.name + ", Qty: " + item.quantity + ", Price: ₹" + item.price);
    }
}

public class InvestorySystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by ID");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search Item");
            System.out.println("7. Display Inventory");
            System.out.println("8. Total Inventory Value");
            System.out.println("9. Sort by Name");
            System.out.println("10. Sort by Price");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: inventory.addAtBeginning(); break;
                case 2: inventory.addAtEnd(); break;
                case 3:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    inventory.addAtPosition(pos);
                    break;
                case 4:
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    inventory.removeById(id);
                    break;
                case 5:
                    System.out.print("Enter Item ID: ");
                    int uid = sc.nextInt();
                    inventory.updateQuantity(uid);
                    break;
                case 6: inventory.searchItem(); break;
                case 7: inventory.display(); break;
                case 8: inventory.calculateTotalValue(); break;
                case 9:
                    System.out.print("Sort (1: Ascending, 0: Descending): ");
                    boolean ascName = sc.nextInt() == 1;
                    inventory.sortInventory(1, ascName);
                    break;
                case 10:
                    System.out.print("Sort (1: Ascending, 0: Descending): ");
                    boolean ascPrice = sc.nextInt() == 1;
                    inventory.sortInventory(2, ascPrice);
                    break;
                case 11: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 11);
    }
}
