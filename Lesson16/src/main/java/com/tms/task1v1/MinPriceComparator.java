package com.tms.task1v1;

import java.util.Comparator;

public class MinPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
