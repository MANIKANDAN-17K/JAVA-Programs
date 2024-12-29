import java.util.Scanner;
interface TicketBooking {
    void bookTicket(String passengerName, String destination);
    void cancelTicket(int bookingId);
}
class BusTicketBooking implements TicketBooking {
    @Override
    public void bookTicket(String passengerName, String destination) {
        System.out.println("Bus ticket booked for " + passengerName + " to " + destination + ".");
    }

    @Override
    public void cancelTicket(int bookingId) {
        System.out.println("Bus ticket with Booking ID " + bookingId + " has been canceled.");
    }
}
class TrainTicketBooking implements TicketBooking {
    @Override
    public void bookTicket(String passengerName, String destination) {
        System.out.println("Train ticket booked for " + passengerName + " to " + destination + ".");
    }

    @Override
    public void cancelTicket(int bookingId) {
        System.out.println("Train ticket with Booking ID " + bookingId + " has been canceled.");
    }
}
class FlightTicketBooking implements TicketBooking {
    @Override
    public void bookTicket(String passengerName, String destination) {
        System.out.println("Flight ticket booked for " + passengerName + " to " + destination + ".");
    }

    @Override
    public void cancelTicket(int bookingId) {
        System.out.println("Flight ticket with Booking ID " + bookingId + " has been canceled.");
    }
}

public class TicketBookingSystemUsingInterface {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Ticket Booking System!");
        System.out.println("1. Bus Ticket");
        System.out.println("2. Train Ticket");
        System.out.println("3. Flight Ticket");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        TicketBooking ticketBooking;

        switch (choice) {
            case 1:
                ticketBooking = new BusTicketBooking();
                break;
            case 2:
                ticketBooking = new TrainTicketBooking();
                break;
            case 3:
                ticketBooking = new FlightTicketBooking();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        ticketBooking.bookTicket(name, destination);

        System.out.print("Enter Booking ID to cancel (or 0 to skip): ");
        int bookingId = scanner.nextInt();
        if (bookingId != 0) {
            ticketBooking.cancelTicket(bookingId);
        }

        scanner.close();   
    }
}
