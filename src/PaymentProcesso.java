// Abstract class that represents the concept of a payment method
abstract class PaymentMethod {
    // Abstract method to process a payment
    abstract void processPayment(double amount);
}

// Concrete class for processing Credit Card payments
class CreditCardPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Internal logic for processing credit card payments is abstracted
    }
}

// Concrete class for processing PayPal payments
class PayPalPayment extends PaymentMethod {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Internal logic for processing PayPal payments is abstracted
    }
}

// Main class to demonstrate abstraction in action
 class PaymentProcessor {
    public static void main(String[] args) {
        // Create a CreditCardPayment object
        PaymentMethod payment = new CreditCardPayment();
        payment.processPayment(150.00);  // Outputs: Processing credit card payment of $150.0

        // Switch to a PayPalPayment object
        payment = new PayPalPayment();
        payment.processPayment(75.00);   // Outputs: Processing PayPal payment of $75.0
    }
}
