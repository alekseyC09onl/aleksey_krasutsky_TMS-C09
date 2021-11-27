package com.tms.task1v1;


import lombok.Getter;
import lombok.Setter;

import java.util.*;

import static com.tms.task1v1.Helpers.consoleInt;

@Getter
@Setter
public class Shop {
    private Set<Product> productList;
    private Product product;

    public Shop() {
        productList = new LinkedHashSet<>();
    }

    public void addProductToList(Product product) {
        if (productList.add(product)) {
            System.out.println(product.getName() + " добавлен в список продуктов.");
        } else {
            System.out.println("Невозможно добавить " + product.getName() + "! Продукт с таким id уже существует!");
        }
    }

    public String getProductList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : productList) {
            stringBuilder.append(product.toString() + "\n");
        }
        return stringBuilder.toString();
    }

    public String getProductNameList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : productList) {
            stringBuilder.append("- " + product.getName() + "\n");
        }
        return stringBuilder.toString();
    }

    public void removeProduct(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                System.out.println("Удален из списка продуктов: " + product.getName());
                break;
            }
        }
    }

    public void changeParametersProduct(int id) {
        System.out.println("Введите:\n1 - поменять название продукта\n2 - поменять цену");
        Scanner console = new Scanner(System.in);
        int i = consoleInt(console);
        for (Product product1 : productList) {
            if (id == product1.getId()) {
                switch (i) {
                    case 1:
                        System.out.println("Введите новое название продукта");
                        product1.setName(console.next());
                        System.out.println("Продукт переименован");
                        break;
                    case 2:
                        System.out.println("Введите новую цену продукта");
                        product1.setPrice(consoleInt(console));
                        System.out.println("Цена успешно изменена");
                        break;
                    default:
                        System.out.println("Необходимо ввести 1 или 2");
                }
            }
        }
    }

    public void printSortListMinToMaxPrice() {
        Comparator<Product> comparatorPrice = new MaxPriceComparator();
        ArrayList<Product> productArrayList = new ArrayList<>(productList);
        productArrayList.sort(comparatorPrice);
        for (Product product1 : productArrayList) {
            System.out.println(product1);
        }
    }

    public void printSortListMaxToMinPrice() {
        Comparator<Product> comparatorPrice = new MinPriceComparator();
        ArrayList<Product> productArrayList = new ArrayList<>(productList);
        Collections.sort(productArrayList, comparatorPrice);
        for (Product product1 : productArrayList) {
            System.out.println(product1);
        }
    }

    public void printSortListBackOrder() {
        ArrayList<Product> productArrayList = new ArrayList<>(productList);
        for (int i = productList.size() - 1; i >= 0; i--) {
            System.out.println(productArrayList.get(i));
        }
    }


}
