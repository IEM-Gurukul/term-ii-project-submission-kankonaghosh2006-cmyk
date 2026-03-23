package hotel;

class Customer extends User {

    Customer(String name) {
        super(name);
    }

    void display() {
        System.out.println("Customer Name: " + name);
        
    }
}