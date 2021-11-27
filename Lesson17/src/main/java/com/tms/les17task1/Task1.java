package com.tms.les17task1;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(7);
        integerList.add(3);
        integerList.add(4);
        Operation operation = (arrayList) -> {
//            for (Object intValue : arrayList) {
//                int i = intValue
//            }
        };

    }

    @FunctionalInterface
    public interface Operation {
        void calculate(List arrayList);
        //Только 1 публичный метод… могут быть статические и default
    }

}
