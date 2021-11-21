package com.tms.task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Lesson14/src/main/java/hw4/objects.txt"))) {
            Car bmw = new Car(new Engine("diesel", (byte) 5), new FuelTank("dieselFuel", 50), "BMW", 290, 40000);
            objectOutputStream.writeObject(bmw);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car car = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Lesson14/src/main/java/hw4/objects.txt"))) {
            car = (Car) objectInputStream.readObject();
            System.out.println(car.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
