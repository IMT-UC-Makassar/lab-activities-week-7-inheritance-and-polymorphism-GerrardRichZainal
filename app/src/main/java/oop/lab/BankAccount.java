package oop.lab;

public abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void transferFunds(double amount, String targetAccount) {
        if (withdraw(amount)) {
            System.out.println("Transferred " + amount + " to " + targetAccount);
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public void payBills(double amount) {
        if (withdraw(amount)) {
            System.out.println("Bill of " + amount + " paid.");
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public abstract void calculateInterest(); // Mandatory for subclasses
}
