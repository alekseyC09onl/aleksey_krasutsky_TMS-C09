package TestMashina;

public class Mainn {
    public static void main(String[] args) {
        Mashina mashina = new Mashina(new Bak(15, 50), 160, 2.0f, "Mercedes", 2019);
        mashina.onOffEngine();
        mashina.goOnCar();
        mashina.goOnCar();
        mashina.goOnCar();
        mashina.getCountDistance();
        mashina.getCarVolumeFuel();
    }
}
