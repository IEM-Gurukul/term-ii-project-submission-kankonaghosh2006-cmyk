package hotel;
abstract class User {
    String name;

    User(String name) {
        this.name = name;
    }

    abstract void display();

}
