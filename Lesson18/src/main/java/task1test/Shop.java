package task1test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shop {
    //    private final int countCashRegister = 10;
    private final int maxConsumers = 10;
    private final int minConsumers = 0;
    private int countConsumers = 0;
//    Consumer consumer;

    public Shop() {
    }

    public synchronized void addConsumer() {
        try {
            if (countConsumers < maxConsumers) {
                notify();
                System.out.println("В очередь добавился человек");
                countConsumers++;
            } else {
                System.out.println("нет свободных касс");
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void serveConsumer() {
        try {
            if (countConsumers > minConsumers) {
                notify();
                countConsumers--;
                System.out.println("отпущен человек");
            } else {
                System.out.println("нет людей в очереди");
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
