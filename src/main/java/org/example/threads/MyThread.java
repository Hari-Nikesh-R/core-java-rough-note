package org.example.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("MyThread run");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
