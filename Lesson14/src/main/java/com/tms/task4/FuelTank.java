package com.tms.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class FuelTank implements Serializable {
    private String typeOfFuel;
    private int volumeFuel;

    @Override
    public String toString() {
        return "FuelTank{" +
                "typeOfFuel='" + typeOfFuel + '\'' +
                ", volumeFuel=" + volumeFuel +
                '}';
    }
}
