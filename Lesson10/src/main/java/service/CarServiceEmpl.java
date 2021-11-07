package service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.Car;

@Getter
@Setter
@AllArgsConstructor

public class CarServiceEmpl implements CarService {
    private Car car;

    @Override
    public void start() throws CarIsNotStart {
        if (((int) (Math.random() * 21)) % 2 == 0) {
            throw new CarIsNotStart("Машина " + car.getBrand() + " не завелась!");
        } else {
            System.out.println("Автомобиль марки " + car.getBrand() + " завелся");
        }
    }
}
