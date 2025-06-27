package OOPS;
import java.util.*;

public class LibraryBookSystem {
    String title;
    String author;
    double price;
    int availability;

    LibraryBookSystem(String title, String author, double price, int availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

  
    boolean borrowBook() {
        if (availability > 0) {
            availability--;
            System.out.println("Book borrowed successfully!");
            return true;
        } else {
            System.out.println("Not available!");
            return false;
        }
    }

    
    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available Copies: " + availability);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the title of the book: ");
        String title = sc.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = sc.nextLine();

        System.out.print("Enter the price of the book: ");
        double price = sc.nextDouble();

        System.out.print("Enter the number of available books: ");
        int availability = sc.nextInt();

        LibraryBookSystem library = new LibraryBookSystem(title, author, price, availability);

       
        library.display();

        System.out.print("\nDo you want to borrow the book? (yes/no): ");
        sc.nextLine();
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            library.borrowBook();
        }

        library.display();

        sc.close();
    }
}
