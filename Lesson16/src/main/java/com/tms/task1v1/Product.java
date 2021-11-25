package com.tms.task1v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;

    @Override
    public String toString() {
        return name + ": " +
                "id = " + id +
                ", price = " + price + ".";
    }
}
