package Task3;

public class Shuttle implements IStart {
    @Override
    public boolean checkBeforeStart() {
        int i = (int) (Math.random() * 11);
        if (i > 3) {
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
