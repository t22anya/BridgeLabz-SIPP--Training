package OOPS;
import java.util.*;
public class LibraryManagement {
	//static
	static String libraryName;
	//final
	
	private  final String  isbn;
	private String author;
	private String title;
	public LibraryManagement(String title,String auhtor,String isbn) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public static void display() {
		System.out.println("Library Name: "+libraryName);
	}
	 public void displayBookDetails() {
	        if (this instanceof LibraryManagement) {
	            System.out.println("Title : " + title);
	            System.out.println("Author: " + author);
	            System.out.println("ISBN  : " + isbn);
	        } else {
	            System.out.println("Not a valid Book object.");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input static library name
        System.out.print("Enter Library Name: ");
        libraryName = sc.nextLine();

        // Input book details
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        // Create Book object
        LibraryManagement b = new LibraryManagement (title, author, isbn);

        // Display
        LibraryManagement.display();
        b.displayBookDetails();



	}

}
