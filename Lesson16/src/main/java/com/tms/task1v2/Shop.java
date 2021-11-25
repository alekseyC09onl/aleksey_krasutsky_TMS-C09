package com.tms.task1v2;


import com.tms.task1v1.IdException;
import com.tms.task1v1.MaxPriceComparator;
import com.tms.task1v1.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Shop {
    private LinkedHashSet<Product> productList;
    private Product product;
    private boolean repeatId;

    public Shop() {
        productList = new LinkedHashSet<>();
    }

    public void addProductToList(com.tms.task1v1.Product product) throws IdException {
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

    public com.tms.task1v1.Product changeParametersProduct(com.tms.task1v1.Product product) {
        return null;
    }

    public List<Product> sortList() {
        Comparator<Product> comparatorPrice = new MaxPriceComparator();
        ArrayList<Product> productArrayList = new ArrayList<>(productList);
        Collections.sort(productArrayList, comparatorPrice);
        return productArrayList;
    }


}
