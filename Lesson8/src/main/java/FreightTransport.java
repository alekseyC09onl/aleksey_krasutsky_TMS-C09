
public class FreightTransport extends LandTransport {
    private int liftingCapacity;
    private int countWeight;

    public FreightTransport(int powerInHorsepower, int maxSpeed, int weight, String brand, int countOfWheels, float fuelConsumption, int liftingCapacity) {
        super(powerInHorsepower, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public float powerInKw() {
        return (float) (super.getPowerInHorsepower() * 0.74);
    }

    public void possibilityLoad(int weight) {
        countWeight += weight;
        if (countWeight <= liftingCapacity) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше!");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("\nГрузоподъемность: %d;", liftingCapacity);
    }
}
