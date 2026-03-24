package hotel;

class Booking {
    Customer customer;
    Room room;

    Booking(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
    }

    void display() {
        System.out.println(customer.name + " booked Room " + room.roomNumber);
    }
}