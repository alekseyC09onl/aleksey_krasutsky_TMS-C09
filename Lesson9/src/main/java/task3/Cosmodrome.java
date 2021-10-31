package task3;

import lombok.SneakyThrows;

public class Cosmodrome {
    @SneakyThrows
    public void start(IStart iStart) {
        if (iStart.checkBeforeStart()) {
            iStart.turnOnEngines();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(700);
            }
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }

    }
}
