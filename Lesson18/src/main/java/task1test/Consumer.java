package task1test;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;

@Getter
@Setter

public class Consumer implements Runnable {
    Shop shop;
    Consumer consumer;
    Random random = new Random();
    private int countOfProducts;
    private ArrayList<ProductsEnum> randomProductList;
    private int id;

    public Consumer(Shop shop) {
        this.randomProductList = new ArrayList<>();
        this.shop = shop;
    }

    @Override
    public void run() {
        shop.addConsumer();
    }

    public ArrayList<ProductsEnum> getRandomProductList() {
        countOfProducts = (int) (Math.random() * 10);
        for (int i = 0; i < countOfProducts; i++) {
            randomProductList.add(ProductsEnum.values()[random.nextInt(ProductsEnum.values().length)]);
        }
        return randomProductList;
    }
}
