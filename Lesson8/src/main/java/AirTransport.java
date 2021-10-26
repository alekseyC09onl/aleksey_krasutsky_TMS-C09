
public class AirTransport extends Transport {
    private int wingspan;
    private int minLengthRunway;

    public AirTransport(int powerInHorsepower, int maxSpeed, int weight, String brand, int wingspan, int minLengthRunway) {
        super(powerInHorsepower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLengthRunway = minLengthRunway;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("\nРазмах крыльев: %d;\nМинимальная длина взлётно-посадочной полосы для взлёта: %d", wingspan, minLengthRunway);

    }
}
