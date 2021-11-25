package com.tms.task1v1;

public class Main {
    public static void main(String[] args) {
        Product cucumber = new Product(15, "огурец", 10);
        Product tomato = new Product(16, "помидор", 5);
        Product carrot = new Product(16, "морковь", 6);
        Product apple = new Product(27, "яблоко", 7);
        Shop shop = new Shop();
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
    }
}
