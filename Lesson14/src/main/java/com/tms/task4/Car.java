package com.tms.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor

public class Car implements Serializable {
    private Engine engine;
    private FuelTank fuelTank;
    private String brandCar;
    private int maxSpeed;
    private int price;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", fuelTank=" + fuelTank +
                ", brandCar='" + brandCar + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
