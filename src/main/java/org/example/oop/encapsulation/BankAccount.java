package org.example.oop.encapsulation;

public class BankAccount {
    private double balance;
    private String upiPin = "1092";

    public double getBalance(String upiPin) {
        if (upiPin.equals(this.upiPin)) {
            return balance;
        }
        throw new IllegalArgumentException("Invalid upi pin");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
