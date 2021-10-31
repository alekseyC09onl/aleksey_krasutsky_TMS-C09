package task2;

public class Sneakers implements IShoes {
    @Override
    public void putON() {
        System.out.println("Надевает кроссовки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает кроссовки");
    }
}
