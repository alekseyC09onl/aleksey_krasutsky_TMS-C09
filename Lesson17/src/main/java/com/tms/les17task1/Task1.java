package com.tms.les17task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(7);
        integerList.add(3);
        integerList.add(4);
        integerList.stream().map((x) -> x * 2).forEach(System.out::println);
    }
}
