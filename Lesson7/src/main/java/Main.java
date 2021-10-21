public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        FuelTank fuelTank = new FuelTank(30, 50);
        Car car = new Car(fuelTank, engine, "Mercedes", 2015);
        car.goOnCar();
        car.onOffEngine();
        car.goOnCar();
        car.goOnCar();
        car.goOnCar();
        car.addVolumeFuelToCar(4);
        engine.setPowerInHorsepower(160);
        engine.setVolumeOfEngine(2.0f);
        car.getCountDistance();
        car.getCarVolumeFuel();
        System.out.println(car);
    }
}
