import model.Car;
import service.CarIsNotStart;
import service.CarServiceEmpl;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 280, 60000);
        Car mercedes = new Car("Mercedes", 260, 50000);
        CarServiceEmpl[] arrayCarService = {new CarServiceEmpl(bmw), new CarServiceEmpl(mercedes)};
        for (CarServiceEmpl carService : arrayCarService) {
            try {
                carService.start();
            } catch (CarIsNotStart e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
