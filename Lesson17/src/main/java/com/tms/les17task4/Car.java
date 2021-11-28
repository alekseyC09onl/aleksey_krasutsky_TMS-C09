package com.tms.les17task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car {
    private String number;
    private int year;

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", year=" + year +
                '}';
    }
}
