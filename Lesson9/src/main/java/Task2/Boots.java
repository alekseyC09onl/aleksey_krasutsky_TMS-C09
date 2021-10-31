package Task2;

public class Boots implements IShoes {
    @Override
    public void putON() {
        System.out.println("Надевает сапоги");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает сапоги");
    }
}
