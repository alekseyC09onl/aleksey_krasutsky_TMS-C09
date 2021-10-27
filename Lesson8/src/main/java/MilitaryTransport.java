import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MilitaryTransport extends AirTransport {
    private boolean systemOfBailout;
    private int countOfRocket;

    public MilitaryTransport(int powerInHorsepower, int maxSpeed, int weight, String brand, int wingspan, int minLengthRunway, boolean systemOfBailout, int countOfRocket) {
        super(powerInHorsepower, maxSpeed, weight, brand, wingspan, minLengthRunway);
        this.systemOfBailout = systemOfBailout;
        this.countOfRocket = countOfRocket;
    }

    public void shot() {
        if (countOfRocket > 0) {
            System.out.println("Ракета пошла...");
            countOfRocket--;
        } else {
            System.out.println("Боеприпасы отсутствуют!");
        }
    }

    public void bailout() {
        if (systemOfBailout) {
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой системы.");
        }
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
