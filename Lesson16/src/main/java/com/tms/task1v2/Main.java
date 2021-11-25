package com.tms.task1v2;

import com.tms.task1v1.IdException;
import com.tms.task1v1.Product;
import com.tms.task1v1.Shop;

public class Main {
    public static void main(String[] args) {
        com.tms.task1v1.Product cucumber = new com.tms.task1v1.Product(15, "огурец", 10);
        com.tms.task1v1.Product tomato = new com.tms.task1v1.Product(16, "помидор", 5);
        com.tms.task1v1.Product carrot = new com.tms.task1v1.Product(16, "морковь", 6);
        com.tms.task1v1.Product apple = new Product(27, "яблоко", 7);
        com.tms.task1v1.Shop shop = new Shop();
        try {
            shop.addProductToList(cucumber);
            shop.addProductToList(tomato);
            shop.addProductToList(apple);
            shop.addProductToList(carrot);
        } catch (IdException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(shop.getProductNameList());
        System.out.println(shop.getProductList());
        shop.sortList();
        System.out.println(shop.getProductList());
        shop.removeProduct(16);
        System.out.println(shop.getProductList());
    }
}
