package OOPS;

public class BookLibrary {
	public int ISBN;
	protected String title;
	private String author;
	BookLibrary(int ISBN,String title,String author){
		this.ISBN =ISBN;
		this.title=title;
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void  setAuthor(String author) {
		this.author=author;
	}
	public void display() {
		System.out.println("ISBN: "+ISBN);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
	}
	public class EBook{
		private double fileSizeMB;

        public EBook(double fileSizeMB) {
            this.fileSizeMB = fileSizeMB;
        }

        public void displayEBook() {
            // Can access outer class's ISBN and title
            System.out.println("EBook Details:");
            System.out.println("ISBN (public): " + ISBN);
            System.out.println("Title (protected): " + title);
            System.out.println("File Size: " + fileSizeMB + "MB");
        }
	}

}
