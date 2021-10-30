import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Transport {
    private int powerInHorsepower;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport(int powerInHorsepower, int maxSpeed, int weight, String brand) {
        this.powerInHorsepower = powerInHorsepower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public float powerInKw() {
        return (float) (getPowerInHorsepower() * 0.74);
    }

    public void info() {
        System.out.printf("Мощность: %d л.с.;\nМаксимальная скорость: %d км/ч;\nМасса: %d;\nМарка: %s;", powerInHorsepower, maxSpeed, weight, brand);
    }
}
