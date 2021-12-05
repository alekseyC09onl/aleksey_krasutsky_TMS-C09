package task1test;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Consumer consumer = new Consumer(shop);
        CashBox cashBox = new CashBox(shop);
        new Thread(consumer).start();
        new Thread(cashBox).start();

    }
}
