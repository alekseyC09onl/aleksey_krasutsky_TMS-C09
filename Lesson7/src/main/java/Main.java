public class Main {
    public static void main(String[] args) {
        FuelTank fuelTank = new FuelTank(3, 50);
        Car car = new Car(fuelTank, 160, 2.0f, "BMW", 2019);
        car.goOnCar();
        car.onOffEngine();
        car.goOnCar();
        car.goOnCar();
        car.goOnCar();
        car.addVolumeFuelToCar(4);
        car.getCountDistance();
        car.getCarVolumeFuel();
        System.out.println(car);
    }
}
