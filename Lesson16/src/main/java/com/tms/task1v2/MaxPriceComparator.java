package com.tms.task1v2;

import com.tms.task1v1.Product;

import java.util.Comparator;

public class MaxPriceComparator implements Comparator<com.tms.task1v1.Product> {
    @Override
    public int compare(com.tms.task1v1.Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
