import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Engine {
    private boolean onOff;
    private int powerInHorsepower;
    private float volumeOfEngine;

    public Engine(int powerInHorsepower, float volumeOfEngine) {
        this.powerInHorsepower = powerInHorsepower;
        this.volumeOfEngine = volumeOfEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "powerInHorsepower=" + powerInHorsepower +
                ", volumeOfEngine=" + volumeOfEngine +
                '}';
    }
}
