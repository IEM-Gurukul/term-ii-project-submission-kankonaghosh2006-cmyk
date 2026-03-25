package hotel;

import java.util.ArrayList;

class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();

    void addRoom(Room room) {
        rooms.add(room);
    }

    void viewRooms() {
        for (Room r : rooms) {
            r.display();
            
            
        }
    }
    void bookRoom(Customer customer, int roomNumber) {
    for (Room r : rooms) {
        if (r.roomNumber == roomNumber && r.isAvailable) {
            r.isAvailable = false;
            Booking b = new Booking(customer, r);
            bookings.add(b);
            System.out.println("Room booked successfully!");
            return;
        }
    }
    System.out.println("Room not available!");
}
}