package task2;

public class LeatherJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надевает кожаную куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимает кожаную куртку");
    }
}
