import java.util.*;
import java.util.stream.*;

class Book {
    String genre;
    int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() { return genre; }
    public int getPages() { return pages; }
}

public class BookStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book genre: ");
            String genre = sc.nextLine();
            System.out.print("Enter number of pages: ");
            int pages = sc.nextInt();
            sc.nextLine();
            books.add(new Book(genre, pages));
        }

        Map<String, IntSummaryStatistics> stats = books.stream()
            .collect(Collectors.groupingBy(Book::getGenre,
                    Collectors.summarizingInt(Book::getPages)));

        stats.forEach((genre, summary) -> {
            System.out.println(genre + " -> " + summary);
        });
    }
}
