package test;

public class MainStore {
    public static void main(String[] args) {
        Store store = new Store(3);
        new Producer(store, 7).start();
        new Consumer(store, 4).start();
        System.out.println("Product left in the store:" + store.getGoodsCounter());
    }
}
