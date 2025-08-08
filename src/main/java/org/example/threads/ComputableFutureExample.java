package org.example.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.lang.Thread.sleep;

public class ComputableFutureExample {
    public static void main(String[] args) throws InterruptedException {
        // Consumer, Supplier, Functions, Predicate


        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                sleep(1000);
                return "User";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                sleep(4000);
                return "Orders";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2);

        combinedFuture.thenRun(() -> {
            System.out.println("Combined completed");
            try {
                System.out.println("Combined: " + future1.get() + " + " + future2.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Main thread continues..");

        sleep(7000);
        System.out.println("Program ended in main");
    }

}
