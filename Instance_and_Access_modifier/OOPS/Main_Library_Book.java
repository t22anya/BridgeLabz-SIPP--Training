package OOPS;

import java.util.Scanner;

public class Main_Library_Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for Book details
        System.out.print("Enter ISBN: ");
        int isbn = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        // Create outer class object
        BookLibrary book = new BookLibrary(isbn, title, author);
        book.display();

        // User input for EBook size
        System.out.print("Enter EBook Size (in MB): ");
        double size = sc.nextDouble();

        // Create inner class object using outer object
        BookLibrary.EBook ebook = book.new EBook(size);
        ebook.displayEBook();

        sc.close();
    }
}
