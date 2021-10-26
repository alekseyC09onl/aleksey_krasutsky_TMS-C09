
public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClassAvailability;

    public CivilTransport(int powerInHorsepower, int maxSpeed, int weight, String brand, int wingspan, int minLengthRunway, int numberOfPassengers, boolean businessClassAvailability) {
        super(powerInHorsepower, maxSpeed, weight, brand, wingspan, minLengthRunway);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }

    public float powerInKw() {
        return (float) (super.getPowerInHorsepower() * 0.74);
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("\nКоличество пассажиров: %d;\nНаличие бизнес-класса: %b", numberOfPassengers, businessClassAvailability);

    }
}
