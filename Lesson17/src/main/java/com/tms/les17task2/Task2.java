package com.tms.les17task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            integers.add((int) (Math.random() * 101));
        }
        System.out.println(integers);
        integers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        long count = integers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("\nКоличество четных чисел листа: " + count);
    }
}
