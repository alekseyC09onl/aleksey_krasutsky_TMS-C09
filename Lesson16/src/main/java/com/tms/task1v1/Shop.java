package com.tms.task1v1;


import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Shop {
    private HashSet<Product> productList;
    private Product product;
    private boolean repeatId;

    public Shop() {
        productList = new LinkedHashSet<>();
    }

    public void addProductToList(Product product) throws IdException {
        if (productList.isEmpty()) {
            productList.add(product);
            System.out.println(product.getName() + " добавлен в список продуктов.");
        } else {
            for (Product product1 : productList) {
                if (product.getId() == product1.getId()) {
                    repeatId = true;
                }
            }
            if (repeatId) {
                throw new IdException("Невозможно добавить " + product.getName() + "! Продукт с таким id уже существует!");
            } else {
                productList.add(product);
                System.out.println(product.getName() + " добавлен в список продуктов.");
            }
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
            }
        }
    }

    public void changeParametersProduct(Product product) {
        System.out.println("Введите:\n1 - поменять название продукта\n2 - поменять цену");
        Scanner console = new Scanner(System.in);
        int i = console.nextInt();
        String newNameProduct = console.nextLine();
        for (Product product1 : productList) {
            if (product.getId() == product1.getId()) {
                switch (i) {
                    case 1:
                        System.out.println("Введите новое название продукта");
                        product1.setName(console.nextLine());
                        break;
                    case 2:
                        System.out.println("Введите новую цену продукта");
                        product1.setPrice(console.nextInt());
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
        Collections.sort(productArrayList, comparatorPrice);
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
