package Transportation;
import java.util.*;
public class BookingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        Transport[] bookings = new Transport[10];

        System.out.println("----- TRANSPORT BOOKING SYSTEM -----");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nBooking #" + (i + 1));

            System.out.println("Choose Transport Type:");
            System.out.println("1. Bus");
            System.out.println("2. Train");
            System.out.println("3. Flight");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter Distance (km): ");
            double distance = sc.nextDouble();

            System.out.print("Enter Base Fare: ");
            double baseFare = sc.nextDouble();

            // -------------------- BUS --------------------
            if (choice == 1) {
                System.out.print("AC? (1 = Yes, 0 = No): ");
                int acInput = sc.nextInt();
                boolean ac = acInput == 1;

                bookings[i] = new Bus(distance, baseFare, ac);
            }

            // -------------------- TRAIN --------------------
            else if (choice == 2) {
                System.out.print("Sleeper? (1 = Yes, 0 = No): ");
                int sl = sc.nextInt();
                boolean sleeper = sl == 1;

                bookings[i] = new Train(distance, baseFare, sleeper);
            }

            // -------------------- FLIGHT --------------------
            else if (choice == 3) {
                System.out.print("Business Class? (1 = Yes, 0 = No): ");
                int bc = sc.nextInt();
                boolean business = bc == 1;

                bookings[i] = new Flight(distance, baseFare, business);
            }

            else {
                System.out.println("Invalid choice! Try again.");
                i--; // repeat same index
            }
        }

        // -------------------- CALCULATIONS --------------------
        double totalRevenue = 0;
        int busCount = 0, trainCount = 0, flightCount = 0;

        System.out.println("\n\nBookings with fare > 20000:");

        for (int i = 0; i < bookings.length; i++) {

            double fare = bookings[i].getFinalFare();
            totalRevenue += fare;

            // Count type
            if (bookings[i] instanceof Bus) busCount++;
            else if (bookings[i] instanceof Train) trainCount++;
            else if (bookings[i] instanceof Flight) flightCount++;

            // Print bookings with fare > 20,000
            if (fare > 20000) {
                System.out.println("Booking #" + (i + 1) + " = " + fare);
            }
        }

        System.out.println("\nTotal Revenue = " + totalRevenue);

        System.out.println("\nBooking Count:");
        System.out.println("Bus = " + busCount);
        System.out.println("Train = " + trainCount);
        System.out.println("Flight = " + flightCount);

	}

}
