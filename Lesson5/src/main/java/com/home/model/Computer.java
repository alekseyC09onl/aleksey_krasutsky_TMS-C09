package com.home.model;

import java.util.Scanner;

public class Computer {
    //    public boolean onOff;
    //    public static boolean onOff;
    Scanner console = new Scanner(System.in);
    boolean burned;
    //    boolean burnedOff;
    byte onOff = 0;

    String cpu;
    int ram;
    int hdd;
    float cyclesOnOff;

    public Computer() {
    }

    public Computer(float cyclesOnOff) {
        this.cyclesOnOff = cyclesOnOff;
    }

    public Computer(String cpu, int ram, int hdd, byte cyclesOnOff) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cyclesOnOff = cyclesOnOff;
    }


    public void description() {
        System.out.println(cpu +" "+ ram + " " + hdd + " " + cyclesOnOff);
    }

    public void on() {
        if (onOff < cyclesOnOff) {
            if (!burned) {
                System.out.println("Внимание! Введите 0 или 1");
                int numConsole = console.nextInt();
                int numRandom = (int) (Math.random() * 2);
                if (numConsole == numRandom) {
                    System.out.println("Внимание, может произойти сбой, необходимо выключить компьютер!");
                    onOff += 0.5;
                    off();
                } else {
                    System.out.println("Компьютер сгорает!");
                    burned = true;
                }
            } else {
                System.out.println("Компьютер уже давно сгорел!");
            }
        } else {
            System.out.println("Превышен лимит ресурса, компьютер сгорел!");
        }
    }

    public void off() {
        if (onOff < cyclesOnOff) {
            if (!burned) {
                System.out.println("Внимание! Введите 0 или 1");
                int numConsole = console.nextInt();
                int numRandom = (int) (Math.random() * 2);
                if (numConsole == numRandom) {
                    System.out.println("Компьютер выключается!");
                    onOff += 0.5;
                } else {
                    System.out.println("Компьютер сгорает!");
                    burned = true;
                }
            } else {
                System.out.println("Компьютер уже давно сгорел!");
            }
        } else {
            System.out.println("Превышен лимит ресурса, компьютер сгорел!");
        }
    }
}
