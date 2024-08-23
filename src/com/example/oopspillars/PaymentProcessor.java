package com.example.oopspillars;

// Main class to demonstrate polymorphism in a payment processing system
public class PaymentProcessor {
    public static void main(String[] args) {
        // Create a CreditCardPayment object
        PaymentMethod creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        // Create a PayPalPayment object
        PaymentMethod payPalPayment = new PayPalPayment("john.doe@example.com");
        // Create a BankTransferPayment object
        PaymentMethod bankTransferPayment = new BankTransferPayment("987654321", "XYZ Bank");

        // Process each payment using polymorphism
        process(creditCardPayment, 250.75);
        process(payPalPayment, 100.00);
        process(bankTransferPayment, 500.00);
    }

    // Method to process any payment, demonstrating runtime polymorphism
    public static void process(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount); // This will call the appropriate method based on the object's type
    }
}
