package task2;

public class Pants implements ITrousers {
    @Override
    public void putOn() {
        System.out.println("Надевает брюки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает брюки");
    }
}
