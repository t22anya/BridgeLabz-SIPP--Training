import java.util.Scanner;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next, prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieDoublyLinkedList {
    MovieNode head = null, tail = null;
    Scanner sc = new Scanner(System.in);

    public void addAtBeginning() {
        MovieNode newNode = getMovieDetails();
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Movie added at beginning.");
    }

    public void addAtEnd() {
        MovieNode newNode = getMovieDetails();
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Movie added at end.");
    }

    public void addAtPosition(int position) {
        if (position <= 1) {
            addAtBeginning();
            return;
        }
        MovieNode newNode = getMovieDetails();
        MovieNode current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            addAtEnd();
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;

        System.out.println("Movie added at position " + position);
    }

    public void removeByTitle(String title) {
        MovieNode current = head;
        while (current != null && !current.title.equalsIgnoreCase(title)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Movie not found.");
            return;
        }
        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        System.out.println("Movie removed.");
    }

    public void searchByDirectorOrRating() {
        System.out.print("Search by (1) Director or (2) Rating: ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.print("Enter director name: ");
            String director = sc.nextLine();
            MovieNode current = head;
            boolean found = false;
            while (current != null) {
                if (current.director.equalsIgnoreCase(director)) {
                    printMovie(current);
                    found = true;
                }
                current = current.next;
            }
            if (!found) System.out.println("No movies found for this director.");
        } else if (choice == 2) {
            System.out.print("Enter rating: ");
            double rating = sc.nextDouble();
            MovieNode current = head;
            boolean found = false;
            while (current != null) {
                if (current.rating == rating) {
                    printMovie(current);
                    found = true;
                }
                current = current.next;
            }
            if (!found) System.out.println("No movies found with this rating.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public void updateRating(String title) {
        MovieNode current = head;
        while (current != null && !current.title.equalsIgnoreCase(title)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Movie not found.");
            return;
        }
        System.out.print("Enter new rating: ");
        current.rating = sc.nextDouble();
        System.out.println("Rating updated.");
    }

    public void displayForward() {
        System.out.println("\n--- Movies in Forward Order ---");
        MovieNode current = head;
        while (current != null) {
            printMovie(current);
            current = current.next;
        }
    }

    public void displayBackward() {
        System.out.println("\n--- Movies in Reverse Order ---");
        MovieNode current = tail;
        while (current != null) {
            printMovie(current);
            current = current.prev;
        }
    }

    private MovieNode getMovieDetails() {
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter director: ");
        String director = sc.nextLine();
        System.out.print("Enter year of release: ");
        int year = sc.nextInt();
        System.out.print("Enter rating: ");
        double rating = sc.nextDouble();
        sc.nextLine(); // consume newline
        return new MovieNode(title, director, year, rating);
    }

    private void printMovie(MovieNode m) {
        System.out.println("Title: " + m.title + ", Director: " + m.director + ", Year: " + m.year + ", Rating: " + m.rating);
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieDoublyLinkedList movieList = new MovieDoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Movie Management System ---");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Specific Position");
            System.out.println("4. Remove Movie by Title");
            System.out.println("5. Search Movie by Director or Rating");
            System.out.println("6. Update Movie Rating by Title");
            System.out.println("7. Display All Movies (Forward)");
            System.out.println("8. Display All Movies (Reverse)");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: movieList.addAtBeginning(); break;
                case 2: movieList.addAtEnd(); break;
                case 3:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    movieList.addAtPosition(pos);
                    break;
                case 4:
                    System.out.print("Enter title to remove: ");
                    String title = sc.nextLine();
                    movieList.removeByTitle(title);
                    break;
                case 5: movieList.searchByDirectorOrRating(); break;
                case 6:
                    System.out.print("Enter title to update rating: ");
                    String updateTitle = sc.nextLine();
                    movieList.updateRating(updateTitle);
                    break;
                case 7: movieList.displayForward(); break;
                case 8: movieList.displayBackward(); break;
                case 9: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }

        } while (choice != 9);
    }
}
