package OOPS;
import java.util.*;
public class LibraryManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Book Title: ");
	        String title = sc.nextLine();

	        System.out.print("Enter Publication Year: ");
	        int year = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter Author Name: ");
	        String authorName = sc.nextLine();

	        System.out.print("Enter Author Bio: ");
	        String bio = sc.nextLine();

	        // Create Author object (inherits from Book)
	        Author author = new Author(title, year, authorName, bio);

	        // Display all info
	        System.out.println("\n--- Book and Author Details ---");
	        author.displayInfo();

	}

}
class Book{
	protected String title;
	protected int publishedYear;
	Book(String title,int publishedYear ){
		this.title=title;
		this.publishedYear=publishedYear;
	}
	public void displayInfo() {
		System.out.println("---/n Books info----");
		System.out.println("Title of the book: "+title);
		System.out.println("Published year of the book :"+publishedYear);
	}
}
class Author extends Book{
	private String name;
	private String bio;
	public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
