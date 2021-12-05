package task1example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(3);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Customer b = new Customer(shop, "Customer" + i, new String[]{"Вода", "Колбаса"},
                    random.nextInt(2) == 0 ? new LeastQueueCashBoxStrategy() : new RandomCashBoxStrategy());
            b.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
