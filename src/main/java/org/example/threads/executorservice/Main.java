package org.example.threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

//        Thread[] threads = new Thread[100];
//        for (int i =0; i < 100; i++) {
//            threads[i] = new Thread(() -> {
//                // task
//                System.out.println("Running in: " + Thread.currentThread().getName());
//            });
//            threads[i].start();
//        }

        // Thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            final int taskId = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskId + " running on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {}
                System.out.println("Task " + taskId + " finished on thread " + Thread.currentThread().getName());
            });
        }

        // Types of Executor service
        //


        executorService.shutdown();

    }
}
