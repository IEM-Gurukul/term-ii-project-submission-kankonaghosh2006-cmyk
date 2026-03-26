
package hotel;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    
    public static void main(String[] args) 
    {

        try(Scanner sc = new Scanner(System.in)) {
            Hotel hotel = new Hotel();

        // Add rooms
        hotel.addRoom(new Room(101));
        hotel.addRoom(new Room(102));
        hotel.addRoom(new Room(103));

        while (true) {
            System.out.println("\n1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Show Bookings");
            System.out.println("5. Exit");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        hotel.viewRooms();
                        break;

                    case 2:
                        sc.nextLine();
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        Customer c = new Customer(name);

                        try {
                            System.out.print("Enter room number: ");
                            int roomNo = sc.nextInt();
                            hotel.bookRoom(c, roomNo);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid room number!");
                            sc.next();
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Enter room number: ");
                            int cancelRoom = sc.nextInt();
                            hotel.cancelBooking(cancelRoom);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid room number!");
                            sc.next();
                        }
                        break;

                    case 4:
                        hotel.showBookings();
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter a number.");
                sc.next(); // clear wrong input
            }
        }
    }
}
}