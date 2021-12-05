package task1test;

public class CashBox implements Runnable {
    Shop shop;
    Consumer consumer;

    public CashBox(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
//        }
        shop.serveConsumer();
    }
}
