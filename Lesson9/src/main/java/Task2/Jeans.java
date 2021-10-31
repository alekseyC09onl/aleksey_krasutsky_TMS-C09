package Task2;

public class Jeans implements ITrousers {
    @Override
    public void putON() {
        System.out.println("Надевает джинсы");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает джинсы");
    }
}
