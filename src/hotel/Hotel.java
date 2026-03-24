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
}