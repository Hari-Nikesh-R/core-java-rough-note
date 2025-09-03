package org.example.threads.locks;

import java.util.concurrent.CompletableFuture;

public class LocksMain {

    /**
     * Synchronous
     * - Automatically handled by JVM
     * - Automatically it releases and handles the lock(Synchronous mechanism to handle the threads with shared resources)
     * - Thread will wait
     * - Cannot interrupt a waiting thread.
     * - use case:
     *     - Simple use case
     */

    /**
     * Locks
     * - Class based
     * - Manually we need to lock and release them.
     * - Manually we need to release and handle the lock.
     * - We can also push the thread parallely if needed.
     * - Use case:
     *      - Complex Algorithm.
     *      - heavy data structure.
     *      - Complex concurrency control.
     */

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable runnable = () -> {
          for (int i = 0; i < 5; i++) {
              bankAccount.deposit(100);
          }
        };

        Thread thread1 = new Thread(runnable, "Thread-1");
        Thread thread2 = new Thread(runnable, "Dora");
        Thread thread3 = new Thread(runnable, "Ben");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance : "  + bankAccount.getBalance());
    }
}
