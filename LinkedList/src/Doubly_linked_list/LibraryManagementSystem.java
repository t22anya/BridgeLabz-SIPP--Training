import java.util.Scanner;

class Book {
    String title;
    String author;
    String genre;
    int id;
    boolean available;
    Book next, prev;

    Book(String title, String author, String genre, int id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

class Library {
    Book head = null, tail = null;
    Scanner sc = new Scanner(System.in);

    public void addAtBeginning() {
        Book book = getBookDetails();
        if (head == null) {
            head = tail = book;
        } else {
            book.next = head;
            head.prev = book;
            head = book;
        }
        System.out.println("Book added at beginning.");
    }

    public void addAtEnd() {
        Book book = getBookDetails();
        if (tail == null) {
            head = tail = book;
        } else {
            tail.next = book;
            book.prev = tail;
            tail = book;
        }
        System.out.println("Book added at end.");
    }

    public void addAtPosition(int pos) {
        if (pos <= 1) {
            addAtBeginning();
            return;
        }
        Book book = getBookDetails();
        Book temp = head;
        int count = 1;

        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd();
            return;
        }

        book.next = temp.next;
        book.prev = temp;
        temp.next.prev = book;
        temp.next = book;

        System.out.println("Book added at position " + pos);
    }

    public void removeById(int id) {
        Book temp = head;

        while (temp != null && temp.id != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed successfully.");
    }

    public void searchBook() {
        System.out.print("Search by (1) Title or (2) Author: ");
        int choice = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        if (choice == 1) {
            System.out.print("Enter Title: ");
            String title = sc.nextLine();
            Book temp = head;
            while (temp != null) {
                if (temp.title.equalsIgnoreCase(title)) {
                    printBook(temp);
                    found = true;
                }
                temp = temp.next;
            }
        } else if (choice == 2) {
            System.out.print("Enter Author: ");
            String author = sc.nextLine();
            Book temp = head;
            while (temp != null) {
                if (temp.author.equalsIgnoreCase(author)) {
                    printBook(temp);
                    found = true;
                }
                temp = temp.next;
            }
        }

        if (!found) System.out.println("Book not found.");
    }

    public void updateAvailability(int id) {
        Book temp = head;
        while (temp != null && temp.id != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found.");
        } else {
            System.out.print("Is the book available? (true/false): ");
            temp.available = sc.nextBoolean();
            System.out.println("Availability updated.");
        }
    }

    public void displayForward() {
        System.out.println("\n--- Library (Forward) ---");
        Book temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        System.out.println("\n--- Library (Reverse) ---");
        Book temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    public void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total number of books: " + count);
    }

    private Book getBookDetails() {
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        System.out.print("Is it available (true/false): ");
        boolean available = sc.nextBoolean();
        sc.nextLine(); // consume newline
        return new Book(title, author, genre, id, available);
    }

    private void printBook(Book b) {
        System.out.println("ID: " + b.id + ", Title: " + b.title + ", Author: " + b.author +
                ", Genre: " + b.genre + ", Available: " + b.available);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Position");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search Book by Title/Author");
            System.out.println("6. Update Availability by ID");
            System.out.println("7. Display Books (Forward)");
            System.out.println("8. Display Books (Reverse)");
            System.out.println("9. Count Total Books");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: lib.addAtBeginning(); break;
                case 2: lib.addAtEnd(); break;
                case 3:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    lib.addAtPosition(pos);
                    break;
                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    int id = sc.nextInt();
                    lib.removeById(id);
                    break;
                case 5: lib.searchBook(); break;
                case 6:
                    System.out.print("Enter Book ID to update: ");
                    int uid = sc.nextInt();
                    lib.updateAvailability(uid);
                    break;
                case 7: lib.displayForward(); break;
                case 8: lib.displayReverse(); break;
                case 9: lib.countBooks(); break;
                case 10: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 10);
    }
}
