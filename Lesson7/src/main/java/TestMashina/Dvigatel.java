package TestMashina;

import lombok.Getter;

public class Dvigatel {
    private boolean onOff;
    private int powerInHorsepower;
    private float volumeOfEngine;

    public Dvigatel(int powerInHorsepower, float volumeOfEngine) {
        this.powerInHorsepower = powerInHorsepower;
        this.volumeOfEngine = volumeOfEngine;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public int getPowerInHorsepower() {
        return powerInHorsepower;
    }

    public void setPowerInHorsepower(int powerInHorsepower) {
        this.powerInHorsepower = powerInHorsepower;
    }

    public float getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public void setVolumeOfEngine(float volumeOfEngine) {
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
