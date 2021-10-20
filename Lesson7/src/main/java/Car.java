import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Car {
    private Engine engine;
    private FuelTank fuelTank;
    private int countDistance;
    private String modelCar;
    private int yearOfIssueCar;

    public Car(Engine engine, FuelTank fuelTank) {
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public boolean onOffEngine() {
        if (fuelTank.getVolumeFuelTank() > 0) {
            engine.setOnOff(!engine.isOnOff());
            if (engine.isOnOff()) {
                System.out.println("Заводится двигатель");
            } else {
                System.out.println("Глушится двигатель");
            }
        } else {
            System.out.println("Бак пуст, машина не заводится!");
        }
        return engine.isOnOff();
    }

    public void goOnCar() {
        if (engine.isOnOff()) {
            System.out.println("Машина поехала.");
            countDistance += 10;
            fuelTank.setVolumeFuelTank(fuelTank.getVolumeFuelTank() - 1);
            if (fuelTank.getVolumeFuelTank() <= 0) {
                System.out.println("Машина глохнет, закончилось топливо.");
                onOffEngine();
            }
        } else {
            System.out.println("Не могу ехать, не завелся двигатель!");
        }
    }

    public void getCountDistance() {
        System.out.println("Машина проехала " + countDistance + " километров.");
    }

    public void getCarVolumeFuel() {
        System.out.println("Осталось " + fuelTank.getVolumeFuelTank() + " литров топлива.");
    }

    public void addVolumeFuelToCar(int addVolumeFuel) {
        fuelTank.setVolumeFuelTank(fuelTank.getVolumeFuelTank() + addVolumeFuel);
        System.out.println("Вы залили " + addVolumeFuel + " литров топлива");
    }


}
