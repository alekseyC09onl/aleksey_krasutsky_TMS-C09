public class Car {
    private Engine engine;
    private FuelTank fuelTank;
    private int countDistance;
    private String modelCar;
    private int yearOfIssueCar;

    public Car(FuelTank fuelTank, int powerInHorsepower, float volumeOfEngine, String modelCar, int yearOfIssueCar) {
        this.engine = new Engine(powerInHorsepower, volumeOfEngine);
        this.fuelTank = fuelTank;
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

    public void addVolumeFuelToCar(int volumeFuel) {
        if ((fuelTank.getVolumeFuelInFuelTank() + volumeFuel) <= fuelTank.getTotalVolumeFuelTank()) {
            fuelTank.setVolumeFuelInFuelTank(fuelTank.getVolumeFuelInFuelTank() + volumeFuel);
            System.out.println("Вы залили топлива: " + volumeFuel + " л.");
        } else {
            System.out.println("Вы не можете залить столько топлива, максимальный объем: " + fuelTank.getTotalVolumeFuelTank());
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine + "\n" +
                "fuelTank=" + fuelTank + "\n" +
                "countDistance=" + countDistance +
                ", modelCar='" + modelCar + '\'' +
                ", yearOfIssueCar=" + yearOfIssueCar +
                '}';
    }
}
