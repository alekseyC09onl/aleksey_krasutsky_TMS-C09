package com.tms.task1v1;


import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@Getter
@Setter
public class Shop {
    private List<Product> productList;
    private Product product;
    private boolean repeatId;

    public Shop() {
        productList = new LinkedList<>();
    }

    public void addProductToList(Product product) throws IdException {
        ListIterator<Product> listIterator = productList.listIterator();
        if (productList.isEmpty()) {
            productList.add(product);
            System.out.println(product.getName() + " добавлен в список продуктов.");
        } else {
            while (listIterator.hasNext()) {
                if (product.getId() == listIterator.next().getId()) {
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
        ListIterator<Product> listIteratorProduct = productList.listIterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (listIteratorProduct.hasNext()) {
            stringBuilder.append(listIteratorProduct.next().toString() + "\n");
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
        ListIterator<Product> listIteratorProduct = productList.listIterator();
        while (listIteratorProduct.hasNext()) {
            if (listIteratorProduct.next().getId() == id) {
                listIteratorProduct.remove();
                System.out.println("Удален из списка продуктов: " + listIteratorProduct.next().getName());
            }
        }
    }

    public Product changeParametersProduct(Product product) {
        return null;
    }

    public List<Product> sortList() {
        Comparator<Product> comparatorPrice = new MaxPriceComparator();
        productList.sort(comparatorPrice);
        return productList;
    }


}
