import model.Car;
import service.CarServiceEmpl;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 280, 60000);
        Car mercedes = new Car("Mercedes", 260, 50000);
        CarServiceEmpl carServiceBmw = new CarServiceEmpl(bmw);
        try {
            carServiceBmw.start();
        } catch (Exception e) {
            System.out.println("Error to start BMW - " + e.getMessage());
        }
        CarServiceEmpl carServiceMercedes = new CarServiceEmpl(mercedes);
        try {
            carServiceMercedes.start();
        } catch (Exception e) {
            System.out.println("Error to start Mercedes - " + e.getMessage());
        }
    }
}
