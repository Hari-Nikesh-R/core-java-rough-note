package org.example.threads;

import org.example.Animal;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class Main {

    public synchronized void start() throws InterruptedException {
        Animal animal = new Animal();
        animal.wait(5000);
    }

    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        int i = 0;
//        while (true) {
//            Thread.sleep(500);
//            System.out.println(i++);
//        }

//        MyRunnable myRunnable = new MyRunnable();
//        new Main().start();
//        int i = 0;
//        while (true) {
//            Thread.sleep(5000);
//
//            System.out.println(i++);
//        }

        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count " + counter.getCounter());
        // blocking

    }

    //
}
