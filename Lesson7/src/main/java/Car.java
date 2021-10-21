public class Car {
    private Engine engine;
    private FuelTank fuelTank;
    private int countDistance;
    private String modelCar;
    private int yearOfIssueCar;

    public Car(FuelTank fuelTank, Engine engine, String modelCar, int yearOfIssueCar) {
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.modelCar = modelCar;
        this.yearOfIssueCar = yearOfIssueCar;
    }


    public boolean onOffEngine() {
        if (fuelTank.getVolumeFuelInFuelTank() > 0) {
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
            fuelTank.setVolumeFuelInFuelTank(fuelTank.getVolumeFuelInFuelTank() - 1);
            if (fuelTank.getVolumeFuelInFuelTank() <= 0) {
                System.out.println("Машина глохнет, закончилось топливо.");
                engine.setOnOff(!engine.isOnOff());
            }
        } else {
            System.out.println("Не могу ехать, не завелся двигатель!");
        }
    }


    public void getCountDistance() {
        System.out.println("Машина проехала: " + countDistance + " км.");
    }

    public void getCarVolumeFuel() {
        System.out.println("Осталось топлива: " + fuelTank.getVolumeFuelInFuelTank() + " л.");
    }

    public void addVolumeFuelToCar(int addVolumeFuel) {
        if ((fuelTank.getVolumeFuelInFuelTank() + addVolumeFuel) <= fuelTank.getTotalVolumeFuelTank()) {
            fuelTank.setVolumeFuelInFuelTank(fuelTank.getVolumeFuelInFuelTank() + addVolumeFuel);
            System.out.println("Вы залили топлива: " + addVolumeFuel + " л.");
        } else {
            System.out.println("Вы не можете залить столько топлива, максимальный объем: " + fuelTank.getTotalVolumeFuelTank());
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine + "\n" +
                ", fuelTank=" + fuelTank + "\n" +
                ", countDistance=" + countDistance +
                ", modelCar='" + modelCar + '\'' +
                ", yearOfIssueCar=" + yearOfIssueCar +
                '}';
    }
}
