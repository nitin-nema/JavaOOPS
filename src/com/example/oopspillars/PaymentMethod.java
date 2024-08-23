package com.example.oopspillars;

// Base class representing a general payment method
class PaymentMethod {
    // Method to process payment, to be overridden by subclasses
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}

// Subclass representing a Credit Card payment
class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    // Constructor to initialize credit card details
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    // Overridden method to process credit card payment
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
    }
}

// Subclass representing a PayPal payment
class PayPalPayment extends PaymentMethod {
    private String email;

    // Constructor to initialize PayPal details
    public PayPalPayment(String email) {
        this.email = email;
    }

    // Overridden method to process PayPal payment
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("PayPal Email: " + email);
    }
}

// Subclass representing a Bank Transfer payment
class BankTransferPayment extends PaymentMethod {
    private String bankAccountNumber;
    private String bankName;

    // Constructor to initialize bank transfer details
    public BankTransferPayment(String bankAccountNumber, String bankName) {
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
    }

    // Overridden method to process bank transfer payment
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
        System.out.println("Bank Account Number: " + bankAccountNumber);
        System.out.println("Bank Name: " + bankName);
    }
}
