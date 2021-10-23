import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FuelTank {
    private int volumeFuelInFuelTank;
    private int totalVolumeFuelTank;

    public FuelTank(int volumeFuelInFuelTank, int totalVolumeFuelTank) {
        if (volumeFuelInFuelTank <= totalVolumeFuelTank) {
            this.volumeFuelInFuelTank = volumeFuelInFuelTank;
            this.totalVolumeFuelTank = totalVolumeFuelTank;
        } else {
            System.out.println("Уровень топлива не может быть больше объема бака");
        }

    }

    @Override
    public String toString() {
        return "FuelTank{" +
                "volumeFuelTank=" + volumeFuelInFuelTank +
                ", totalVolumeFuelTank=" + totalVolumeFuelTank +
                '}';
    }
}
