public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine(), new FuelTank(15));
        car.onOffEngine();
        car.goOnCar();
        car.goOnCar();
        car.goOnCar();
        car.getCountDistance();
        car.getCarVolumeFuel();
        car.addVolumeFuelToCar(20);
        car.getCarVolumeFuel();
        car.goOnCar();
        car.goOnCar();
        car.goOnCar();
        car.goOnCar();
        car.goOnCar();
        car.getCountDistance();
        car.getCarVolumeFuel();
        //проверить если в дороге закончится топливо
    }
}
