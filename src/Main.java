

public class Main {
    public static void main(String[] args) {
        System.out.println("Hotel Booking System Started...");
    }
}

// Abstract User class
abstract class User {
    String name;

    User(String name) {
        this.name = name;
    }

    abstract void display();
}