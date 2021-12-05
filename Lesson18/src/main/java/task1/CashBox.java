package task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CashBox {
    private static int cashBoxCounter = 1;
    private int id;

    public CashBox() {
        this.id = cashBoxCounter++;
    }

    public synchronized void serveCustomer(Customer customer) {
        System.out.println("Касса № " + id + " обслуживает " + customer.getCustomerName());
        for (String product : customer.getProductList()) {
            System.out.println(customer.getCustomerName() + " купил " + product);
            try {
                Thread.sleep(1000 * 3);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }
}


