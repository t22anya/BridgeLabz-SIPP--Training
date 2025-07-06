import java.util.*;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketSystem {
    private Ticket head = null;
    private Ticket tail = null;

    Scanner sc = new Scanner(System.in);

    public void addTicket() {
        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // ✅ FIX: consume the leftover newline

        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        String seat = sc.nextLine();

        System.out.print("Enter Booking Time: ");
        String time = sc.nextLine();

        Ticket newTicket = new Ticket(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }

        System.out.println("Ticket booked successfully.");
    }

    public void removeTicketById(int id) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head;
        Ticket prev = tail;
        boolean found = false;

        do {
            if (current.ticketId == id) {
                found = true;
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Ticket removed successfully.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("Ticket ID not found.");
        }
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        System.out.println("\n--- Booked Tickets ---");
        Ticket temp = head;
        do {
            printTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchTicket() {
        System.out.print("Search by (1) Customer Name or (2) Movie Name: ");
        int choice = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        if (choice == 1) {
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();
            Ticket temp = head;
            do {
                if (temp.customerName.equalsIgnoreCase(name)) {
                    printTicket(temp);
                    found = true;
                }
                temp = temp.next;
            } while (temp != head);
        } else if (choice == 2) {
            System.out.print("Enter Movie Name: ");
            String movie = sc.nextLine();
            Ticket temp = head;
            do {
                if (temp.movieName.equalsIgnoreCase(movie)) {
                    printTicket(temp);
                    found = true;
                }
                temp = temp.next;
            } while (temp != head);
        }

        if (!found) {
            System.out.println("No matching ticket found.");
        }
    }

    public void countTickets() {
        if (head == null) {
            System.out.println("Total Tickets Booked: 0");
            return;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Tickets Booked: " + count);
    }

    private void printTicket(Ticket t) {
        System.out.println("ID: " + t.ticketId + ", Customer: " + t.customerName + ", Movie: " + t.movieName
                + ", Seat: " + t.seatNumber + ", Time: " + t.bookingTime);
    }
}

public class TickerReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketSystem system = new TicketSystem();
        int choice;

        do {
            System.out.println("\n--- Online Ticket Reservation ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Remove Ticket by ID");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search Ticket");
            System.out.println("5. Count Total Tickets");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: system.addTicket(); break;
                case 2:
                    System.out.print("Enter Ticket ID to remove: ");
                    int id = sc.nextInt();
                    system.removeTicketById(id);
                    break;
                case 3: system.displayTickets(); break;
                case 4: system.searchTicket(); break;
                case 5: system.countTickets(); break;
                case 6: System.out.println("Exiting system..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}
