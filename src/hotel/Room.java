package hotel;

class Room {
    int roomNumber;
    boolean isAvailable;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true;
    }

    void display() {
        System.out.println("Room " + roomNumber + " Available: " + isAvailable);
    }
}