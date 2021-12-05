package task1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Customer extends Thread {
    private final String customerName;
    private Shop shop;
    private List<String> productList;

    public Customer(Shop shop, String customerName, List<String> productList) {
        this.shop = shop;
        this.customerName = customerName;
        this.productList = productList;
    }

    @Override
    public void run() {
        CashBox cashBoxForThisCustomer = shop.getArrayCashBox()[(int) (Math.random() * 11)];
        System.out.println(customerName + " обслуживается в кассе № " + cashBoxForThisCustomer.getId());
        cashBoxForThisCustomer.serveCustomer(this);
    }
}
