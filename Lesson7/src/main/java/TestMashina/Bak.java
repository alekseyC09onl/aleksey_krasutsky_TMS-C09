package TestMashina;

import lombok.Getter;
import lombok.Setter;

public class Bak {
    private int volumeFuelInFuelTank;
    private int totalVolumeFuelTank;

    public int getVolumeFuelInFuelTank() {
        return volumeFuelInFuelTank;
    }

    public void setVolumeFuelInFuelTank(int volumeFuelInFuelTank) {
        this.volumeFuelInFuelTank = volumeFuelInFuelTank;
    }

    public int getTotalVolumeFuelTank() {
        return totalVolumeFuelTank;
    }

    public void setTotalVolumeFuelTank(int totalVolumeFuelTank) {
        this.totalVolumeFuelTank = totalVolumeFuelTank;
    }

    public Bak(int volumeFuelInFuelTank, int totalVolumeFuelTank) {
        if (volumeFuelInFuelTank <= totalVolumeFuelTank) {
            this.volumeFuelInFuelTank = volumeFuelInFuelTank;
            this.totalVolumeFuelTank = totalVolumeFuelTank;
        } else {
            this.volumeFuelInFuelTank = 0;
            this.totalVolumeFuelTank = 0;
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
