package Task3;

import java.util.Scanner;

public class SpaceX implements IStart {
    Scanner console = new Scanner(System.in);

    @Override
    public boolean checkBeforeStart() {
        boolean flag = false;
        System.out.println("Для предстартовой проверки необходимо угадать число от 1 до 40 за 5 попыток ");
        int rand = (int) ((Math.random() * 40) + 1);
        for (int i = 5; i > 0; i--) {
            System.out.println("Введите число, осталось попыток: " + i);
            int cons = console.nextInt();
            if (rand < cons) {
                System.out.println("Введенное число больше загаданного");
                if (i == 1) {
                    System.out.println("Загаданное число: " + rand);
                    flag = false;
                }
            } else if (rand > cons) {
                System.out.println("Введенное число меньше загаданного");
                if (i == 1) {
                    System.out.println("Загаданное число: " + rand);
                    flag = false;
                }
            } else {
                System.out.println("Вы угадали! Предстартовая проверка успешно пройдена");
                flag = true;
                break;
            }
        }
        return flag;
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
