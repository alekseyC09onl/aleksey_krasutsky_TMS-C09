package task3;

import java.util.Scanner;

public class SpaceX implements IStart {
    Scanner console = new Scanner(System.in);

    @Override
    public boolean checkBeforeStart() {
        System.out.println("Для предстартовой проверки необходимо угадать число от 1 до 40 за 5 попыток ");
        int rand = (int) ((Math.random() * 40) + 1);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите число, попытка №" + i);
            int cons = console.nextInt();
            if (rand == cons) {
                System.out.println("Вы угадали! Предстартовая проверка успешно пройдена");
                return true;
            } else if (rand > cons) {
                System.out.println("Введенное число меньше загаданного");
            } else {
                System.out.println("Введенное число больше загаданного");
            }
        }
        System.out.println("Загаданное число: " + rand);
        return false;
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
