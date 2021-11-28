package com.tms.les17task3;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "arya", "sansa");
        names.stream().map(n -> new StringBuilder().append(n.substring(0, 1).toUpperCase()).append(n.substring(1))).forEach(System.out::println);
    }
}
