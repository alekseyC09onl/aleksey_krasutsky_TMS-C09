package com.tms.task4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Engine implements Serializable {
    private String typeEngine;
    private transient byte countOfCylinder;

    @Override
    public String toString() {
        return "Engine{" +
                "typeEngine='" + typeEngine + '\'' +
                ", countOfCylinder=" + countOfCylinder +
                '}';
    }
}
