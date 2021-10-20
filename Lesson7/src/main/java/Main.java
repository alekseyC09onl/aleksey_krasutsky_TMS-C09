public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine(), new FuelTank(3));
        car.onOffEngine();
        car.getCarVolumeFuel();
        car.goOnCar();
        car.goOnCar();
        car.goOnCar();
        car.getCarVolumeFuel();
        //проверить если в дороге закончится топливо
    }
}
