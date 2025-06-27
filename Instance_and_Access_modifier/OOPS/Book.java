package OOPS;
import java.util.*;
public class Book {
	String title;
	String author;
	double price;
	Book(){
		this.title="";
		this.author="";
		this.price=0.0;
	}
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price =price;
	}
	void display() {
		System.out.println("\n---Book Details---");
		System.out.println("title of the book: "+title);
		System.out.println("Author of the book: "+author);
	    System.out.println("Price of the book:" +price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the title of book:");
		String title= sc.nextLine();
		System.out.println("Enter the author of book:");
		String author=sc.nextLine();
		System.out.println("Enter the price book:");
		double price = sc.nextDouble();
		Book b= new Book(title,author,price);
		b.display();
		
	}

}
