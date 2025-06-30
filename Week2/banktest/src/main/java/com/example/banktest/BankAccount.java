package com.example.banktest;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance)
            balance -= amount;
        else
            throw new IllegalArgumentException("Insufficient funds");
    }

    public int getBalance() {
        return balance;
    }
}
