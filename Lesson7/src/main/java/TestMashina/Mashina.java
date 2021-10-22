package TestMashina;

public class Mashina {
    private Dvigatel dvigatel;
    private Bak bak;
    private int countDistance;
    private String modelCar;
    private int yearOfIssueCar;

    public Mashina(Bak bak, int powerInHorsepower, float volumeOfEngine, String modelCar, int yearOfIssueCar) {
        this.dvigatel = new Dvigatel(powerInHorsepower, volumeOfEngine);
        this.bak = bak;
        this.modelCar = modelCar;
        this.yearOfIssueCar = yearOfIssueCar;
    }



    public boolean onOffEngine() {
        if (bak.getVolumeFuelInFuelTank() > 0) {
            dvigatel.setOnOff(!dvigatel.isOnOff());
            if (dvigatel.isOnOff()) {
                System.out.println("Заводится двигатель");
            } else {
                System.out.println("Глушится двигатель");
            }
        } else {
            System.out.println("Бак пуст, машина не заводится!");
        }
        return dvigatel.isOnOff();
    }

    public void goOnCar() {
        if (dvigatel.isOnOff()) {
            System.out.println("Машина поехала.");
            countDistance += 10;
            bak.setVolumeFuelInFuelTank(bak.getVolumeFuelInFuelTank() - 1);
            if (bak.getVolumeFuelInFuelTank() <= 0) {
                System.out.println("Машина глохнет, закончилось топливо.");
                dvigatel.setOnOff(!dvigatel.isOnOff());
            }
        } else {
            System.out.println("Не могу ехать, не завелся двигатель!");
        }
    }


    public void getCountDistance() {
        System.out.println("Машина проехала: " + countDistance + " км.");
    }

    public void getCarVolumeFuel() {
        System.out.println("Осталось топлива: " + bak.getVolumeFuelInFuelTank() + " л.");
    }

    public void addVolumeFuelToCar(int addVolumeFuel) {
        if ((bak.getVolumeFuelInFuelTank() + addVolumeFuel) <= bak.getTotalVolumeFuelTank()) {
            bak.setVolumeFuelInFuelTank(bak.getVolumeFuelInFuelTank() + addVolumeFuel);
            System.out.println("Вы залили топлива: " + addVolumeFuel + " л.");
        } else {
            System.out.println("Вы не можете залить столько топлива, максимальный объем: " + bak.getTotalVolumeFuelTank());
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + dvigatel + "\n" +
                ", fuelTank=" + bak + "\n" +
                ", countDistance=" + countDistance +
                ", modelCar='" + modelCar + '\'' +
                ", yearOfIssueCar=" + yearOfIssueCar +
                '}';
    }
}
