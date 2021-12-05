package task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        List<String> productList = Arrays.asList("сыр, творог, чеснок");
        for (int i = 1; i < 15; i++) {
            Customer customer = new Customer(shop, "Покупатель_" + i, productList);
            customer.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
