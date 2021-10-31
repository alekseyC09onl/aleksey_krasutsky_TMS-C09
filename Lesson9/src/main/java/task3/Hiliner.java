package task3;

public class Hiliner implements IStart {
    @Override
    public boolean checkBeforeStart() {
        int i = (int) ((Math.random() * 100) + 1);
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void turnOnEngines() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
