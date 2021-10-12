package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Computer computer1 = new Computer("Core i5", 8, 500, 5);
        Computer computer2 = new Computer("ryzen 3", 2, 128);
        computer1.description();
        computer2.description();
        computer1.on();
        Thread.sleep(3000);
        computer2.on();
        Thread.sleep(3000);
        computer1.off();
        Thread.sleep(3000);
        computer2.off();
    }
}
