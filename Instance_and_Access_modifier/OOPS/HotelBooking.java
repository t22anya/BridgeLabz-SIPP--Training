package OOPS;
import java.util.*;
public class HotelBooking {
	String guestName;
	String roomType;
	int night;
	HotelBooking(String guestName,String roomType,int night){
		this.guestName=guestName;
		this.roomType=roomType;
		this.night=night;
	}
	HotelBooking(){
		this.guestName="";
		this.roomType="";
		this.night=0;
	}
	HotelBooking(HotelBooking other){
		this.guestName = other.guestName;
		this.roomType=other.roomType;
		this.night=other.night;
	}
	void display() {
		System.out.println("\n---Hotel details---");
		System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights Stay: " + night);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Guest Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room Type: ");
        String room = sc.nextLine();

        System.out.print("Enter Number of Nights: ");
        int nights = sc.nextInt();
        HotelBooking booking1= new HotelBooking(name,room,nights);
        HotelBooking booking2 = new HotelBooking();
        HotelBooking booking3 = new HotelBooking(booking1);
        System.out.println("\nBooking 1 (Parameterized):");
        booking1.display();

        System.out.println("\nBooking 2 (Default):");
        booking2.display();

        System.out.println("\nBooking 3 (Copy of Booking 1):");
        booking3.display();
        

	}

}
