import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LandTransport extends Transport {
    private int countOfWheels;
    private float fuelConsumption;

    public LandTransport(int powerInHorsepower, int maxSpeed, int weight, String brand, int countOfWheels, float fuelConsumption) {
        super(powerInHorsepower, maxSpeed, weight, brand);
        this.countOfWheels = countOfWheels;
        this.fuelConsumption = fuelConsumption;
    }


    @Override
    public void info() {
        super.info();
        System.out.printf("\nКоличество колес: %d;\nРасход топлива: %f", countOfWheels, fuelConsumption);
    }
}
