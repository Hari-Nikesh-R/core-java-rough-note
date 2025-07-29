package org.example.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.deposit(1000);
        bankAccount.deposit(10);

        System.out.println(bankAccount.getBalance("1092"));
    }
}
