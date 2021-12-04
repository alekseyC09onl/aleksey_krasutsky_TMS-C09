package test;

public class MyThread2 implements Runnable {
    public MyThread2() {
    }

    @Override
    public void run() {
        System.out.println("Potok poehal: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Potok prervan");
        }
        System.out.println("Potok prekratil rabotu: " + Thread.currentThread().getName());
    }
}
