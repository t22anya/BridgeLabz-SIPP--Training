import java.util.*;
 class BookDetails {
	String title;
	String author;
	double price;
	BookDetails(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price = price;
	}
	void displayDetails() {
		System.out.println("\n----Book Details----");
		System.out.println("The title of a book: "+title);
		System.out.println("The author of the book is: "+author);
		System.out.println("The price of the book: "+price);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of the book: ");
		String title= sc .next();
		System.out.println("Enter the author of the book: ");
		String author = sc.next();
		System.out.println("Enter the price of a book: ");
		double price =sc.nextDouble();
		BookDetails book = new BookDetails(title, author ,price);
		book.displayDetails();
		sc.close();
		

	}

}
