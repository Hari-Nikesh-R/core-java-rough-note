package org.example.threads.executorservice;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExample {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(() -> {
            System.out.println("Running every 2 seconds" + Thread.currentThread().getName());
        }, 0, 2, TimeUnit.SECONDS);


        AtomicInteger count = new AtomicInteger(0);

        executorService.schedule(() -> {
            System.out.println("Stopping...");
            executorService.shutdownNow();
        }, 10, TimeUnit.SECONDS);
    }
}
