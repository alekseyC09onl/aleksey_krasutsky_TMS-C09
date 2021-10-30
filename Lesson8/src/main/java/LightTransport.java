
public class LightTransport extends LandTransport {
    private String carBody;
    private int numberOfPassengers;

    public LightTransport(int powerInHorsepower, int maxSpeed, int weight, String brand, int countOfWheels, float fuelConsumption, String carBody, int numberOfPassengers) {
        super(powerInHorsepower, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        this.carBody = carBody;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void distanceOfTime(int time) {
        float distance = super.getMaxSpeed() * time;
        System.out.println("За время " + time + " ч автомобиль " + super.getBrand() + " , двигаясь с максимальной скоростью " + super.getMaxSpeed() + " км/ч, проедет " + distance + " км и израсходует " + consumedFuel(distance) + " л топлива.");
    }

    private float consumedFuel(float distance) {
        return (distance * super.getFuelConsumption() / 100);
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("\nТип кузова: %s;\nКоличество пассажиров: %d", carBody, numberOfPassengers);
    }
}
