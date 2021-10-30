import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean businessClassAvailability;
    private int countOfPassengers;

    public CivilTransport(int powerInHorsepower, int maxSpeed, int weight, String brand, int wingspan, int minLengthRunway, int numberOfPassengers, boolean businessClassAvailability) {
        super(powerInHorsepower, maxSpeed, weight, brand, wingspan, minLengthRunway);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }

    public void possibilityLoadPassengers(int passengers) {
        countOfPassengers += passengers;
        if (countOfPassengers <= numberOfPassengers) {
            System.out.println("Самолет загружен.");
        } else {
            System.out.println("Вам нужен самолет побольше!");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("\nКоличество пассажиров: %d;\nНаличие бизнес-класса: %b", numberOfPassengers, businessClassAvailability);

    }
}
