package com.example.oopspillars;

// Class representing a bank account with encapsulation
class BankAccount {
    // Private attributes
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Main class to demonstrate encapsulation
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("1234567890", 500.0);
        myAccount.deposit(150.0);
        myAccount.withdraw(100.0);
        System.out.println("Final balance: $" + myAccount.getBalance());
    }
}
