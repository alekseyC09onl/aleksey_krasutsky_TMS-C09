package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Car {
    private String brand;
    private int maxSpeed;
    private int price;

    public Car() {
    }
}
