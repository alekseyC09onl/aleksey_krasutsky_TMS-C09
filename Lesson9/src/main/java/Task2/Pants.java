package Task2;

public class Pants implements ITrousers {
    @Override
    public void putON() {
        System.out.println("Надевает брюки");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает брюки");
    }
}
