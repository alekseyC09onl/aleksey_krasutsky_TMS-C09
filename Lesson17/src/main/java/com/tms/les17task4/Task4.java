package com.tms.les17task4;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017)
        );

        cars.stream()
                .filter(n -> n.getYear() >= 2010)
                .filter(n -> n.getNumber() != null)
                .filter(n -> !n.getNumber().isBlank())
                .forEach(n -> System.out.println(n.toString())
                );
    }
}
