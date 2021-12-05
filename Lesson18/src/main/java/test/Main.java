package test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Glavnii potok nachal rabotu...");
//        for (int i = 0; i < 3; i++) {
//            new MyThread("MyThread " + i).start();
//        }
//        MyThread myThread = new MyThread("MyThread");
//        myThread.start();
//        try {
//            myThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        new Thread(new MyThread2(), "sfs").start();
        System.out.println("Glavnii potok zavershil rabotu...");

    }
}
