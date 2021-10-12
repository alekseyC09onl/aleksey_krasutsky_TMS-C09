package com.home.model;

import java.util.Scanner;

public class Computer {
    Scanner console = new Scanner(System.in);
    boolean burned;
    int onOff;

    String cpu;
    int ram;
    int hdd;
    int cyclesOnOff;


    public Computer(String cpu) {
        this.cpu = cpu;
        this.ram = 0;
        this.hdd = 0;
        this.cyclesOnOff = 2;
    }

    public Computer(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = 0;
        this.cyclesOnOff = 2;
    }

    public Computer(String cpu, int ram, int hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cyclesOnOff = 2;
    }


    public Computer(String cpu, int ram, int hdd, int cyclesOnOff) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cyclesOnOff = cyclesOnOff;

    }


    public void description() {
        System.out.println("CPU:\t" + cpu + "\n" + "RAM:\t" + ram + "\n" + "HDD:\t" + hdd + "\n" + "Циклы работы:\t" + cyclesOnOff + "\n");
    }

    public void on() {
        if (onOff <= cyclesOnOff) {
            if (!burned) {
                System.out.println("Внимание! Введите 0 или 1 для включения компьютера " + cpu);
                int numConsole = console.nextInt();
                int numRandom = (int) (Math.random() * 2);
                if (numConsole == numRandom) {
                    System.out.println("Внимание, может произойти сбой, необходимо выключить компьютер " + cpu);
                    onOff += 1;
                    off();
                } else {
                    System.out.println("Компьютер " + cpu + " сгорает!");
                    burned = true;
                }
            } else {
                System.out.println("Компьютер " + cpu + " уже давно сгорел!");
            }
        } else {
            System.out.println("Превышен лимит ресурса, компьютер " + cpu + " сгорел!");
        }
    }

    public void off() {
        if (onOff <= cyclesOnOff) {
            if (!burned) {
                System.out.println("Внимание! Введите 0 или 1 для выключения компьютера " + cpu);
                int numConsole = console.nextInt();
                int numRandom = (int) (Math.random() * 2);
                if (numConsole == numRandom) {
                    System.out.println("Компьютер " + cpu + " выключается! Его необходимо включить!");
                    onOff += 1;
                    on();
                } else {
                    System.out.println("Компьютер " + cpu + " сгорает!");
                    burned = true;
                }
            } else {
                System.out.println("Компьютер " + cpu + " уже давно сгорел!");
            }
        } else {
            System.out.println("Превышен лимит ресурса, компьютер " + cpu + " сгорел!");
        }
    }
}
