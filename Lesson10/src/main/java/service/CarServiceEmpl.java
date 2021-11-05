package service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.Car;

@Getter
@Setter
@AllArgsConstructor

public class CarServiceEmpl implements CarService {
    Car car;

    @Override
    public void start() throws Exception {
        if (((int) (Math.random() * 21)) % 2 == 0) {
            throw new Exception("Exception: value of random number is even!");
        } else {
            System.out.println("Автомобиль марки " + car.getBrand() + " завелся");
        }
    }
}
