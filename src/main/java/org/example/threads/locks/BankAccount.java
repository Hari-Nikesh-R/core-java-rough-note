package org.example.threads.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;
    void deposit(int amount) {
                int newBalance = balance + amount;
                System.out.println(Thread.currentThread().getName() + " deposited " + newBalance);
                balance = newBalance;

       }

    public int getBalance() {
        return balance;
    }
}
