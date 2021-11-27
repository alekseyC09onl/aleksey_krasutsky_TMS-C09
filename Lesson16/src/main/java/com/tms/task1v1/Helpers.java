package com.tms.task1v1;

import lombok.experimental.UtilityClass;

import java.util.Scanner;

@UtilityClass
public class Helpers {
    public static int consoleInt(Scanner console) {
        while (!console.hasNextInt()) {
            System.out.println("Введите число, не букву!");
            console.next();
        }
        int i = console.nextInt();
        return i;
    }
}
