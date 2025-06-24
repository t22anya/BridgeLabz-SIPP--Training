import java.util.*;
public class MovieTicket {
	String movieName;
	String seatNumber;
	double  price;
	 MovieTicket() {
	        movieName = "";
	        seatNumber = "";
	        price = 0.0;
	    }
	void bookTicket(String mvoieName,String seatNumber,double price){
		this.movieName=movieName;
		this.seatNumber=seatNumber;
		this.price=price;
	}
	void bookingDetails() {
		System.out.println("----- Ticket Details -----");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: Rs." + price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the movie Name: ");
		String movieName= sc.nextLine();
		System.out.println("Enter the seat number: ");
		String seatNumber = sc.nextLine();
		System.out.println("Enter the price: ");
		double price = sc.nextDouble();
		MovieTicket movie = new MovieTicket();
		movie.bookTicket(movieName,seatNumber,price);
		movie.bookingDetails();
		
		

	}

}
