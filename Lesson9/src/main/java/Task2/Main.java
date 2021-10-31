package Task2;

public class Main {
    public static void main(String[] args) {
        Person alex = new Person("Alex", new JeanJacket(), new Jeans(), new Sneakers());
        Person bob = new Person("Bob", new LeatherJacket(), new Pants(), new Boots());
        alex.putON();
        bob.takeOff();
    }
}
