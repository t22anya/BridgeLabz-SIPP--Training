package OOPS;
import java.util.*;

// Interface: Reservable
interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract Class: LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower = null; // Encapsulated

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();

    protected String getBorrower() {
        return borrower;
    }

    protected void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public boolean isBorrowed() {
        return borrower != null;
    }
}

// Book class
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!isBorrowed()) {
            setBorrower(borrowerName);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!isBorrowed()) {
            setBorrower(borrowerName);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (!isBorrowed()) {
            setBorrower(borrowerName);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isBorrowed();
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LibraryItem> items = new ArrayList<>();

        System.out.print("Enter number of library items to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));
            System.out.print("Enter item type (Book/Magazine/DVD): ");
            String type = sc.nextLine();

            System.out.print("Enter ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            if (type.equalsIgnoreCase("Book")) {
                items.add(new Book(id, title, author));
            } else if (type.equalsIgnoreCase("Magazine")) {
                items.add(new Magazine(id, title, author));
            } else if (type.equalsIgnoreCase("DVD")) {
                items.add(new DVD(id, title, author));
            } else {
                System.out.println("Invalid item type. Skipping...");
            }
        }

        System.out.println("\n====== Library Summary ======");
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                System.out.print("Enter borrower's name to reserve: ");
                String borrower = sc.nextLine();

                Reservable r = (Reservable) item;
                if (r.reserveItem(borrower)) {
                    System.out.println(" Reserved by " + borrower);
                } else {
                    System.out.println(" Already reserved.");
                }

                System.out.println("Available: " + r.checkAvailability());
            }
        }

    }
}
