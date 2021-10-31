package task2;

public class Boots implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Надевает сапоги");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает сапоги");
    }
}
