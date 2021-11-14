package service;

public class CarIsNotStart extends Throwable {
    public CarIsNotStart() {
    }

    public CarIsNotStart(String message) {
        super(message);
    }
}
