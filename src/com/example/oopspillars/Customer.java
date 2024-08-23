package com.example.oopspillars;

// Encapsulated class representing a Customer in an e-commerce system
class Customer {
    // Private attributes (data members) - hidden from outside access
    private String customerId;
    private String customerName;
    private String email;
    private String address;
    private double accountBalance;

    // Constructor to initialize the Customer object
    public Customer(String customerId, String customerName, String email, String address, double accountBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.accountBalance = accountBalance;
    }

    // Public methods to provide controlled access to the private data

    // Getter method for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Setter method for customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter method for email
    public String getEmail() {
        return email;
    }

    // Setter method for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter method for address
    public String getAddress() {
        return address;
    }

    // Setter method for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter method for accountBalance
    public double getAccountBalance() {
        return accountBalance;
    }

    // Method to add funds to the account balance
    public void addFunds(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Funds added: " + amount + ". New balance: " + accountBalance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Method to make a purchase and deduct the amount from the account balance
    public void makePurchase(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Purchase successful. Amount deducted: " + amount + ". Remaining balance: " + accountBalance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
