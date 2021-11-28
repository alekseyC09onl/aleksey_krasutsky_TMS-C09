package com.tms.les17task6;

import java.util.Comparator;

public class ComparatorYearBook implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear() - o2.getYear();
    }
}
