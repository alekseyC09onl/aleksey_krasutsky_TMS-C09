
public class MilitaryTransport extends AirTransport {
    private boolean systemOfBailout;
    private int countOfRocket;

    public MilitaryTransport(int powerInHorsepower, int maxSpeed, int weight, String brand, int wingspan, int minLengthRunway, boolean systemOfBailout, int countOfRocket) {
        super(powerInHorsepower, maxSpeed, weight, brand, wingspan, minLengthRunway);
        this.systemOfBailout = systemOfBailout;
        this.countOfRocket = countOfRocket;
    }

    public float powerInKw() {
        return (float) (super.getPowerInHorsepower() * 0.74);
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("\nНаличие системы катапультирования: %b;\nКоличество ракет: %d", systemOfBailout, countOfRocket);
    }
}
