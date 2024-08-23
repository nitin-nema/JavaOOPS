package com.example.oopspillars;

// Main class to demonstrate encapsulation in the Customer class
public class ECommerceSystem {
    public static void main(String[] args) {
        // Create a new Customer object
        Customer customer = new Customer("C123", "John Doe", "john.doe@example.com", "123 Elm Street", 500.00);

        // Accessing and modifying data through public methods
        System.out.println("Customer Name: " + customer.getCustomerName());
        customer.setCustomerName("Jane Doe");
        System.out.println("Updated Customer Name: " + customer.getCustomerName());

        // Adding funds to the account
        customer.addFunds(100.00); // Outputs: Funds added: 100.0. New balance: 600.0

        // Making a purchase
        customer.makePurchase(150.00); // Outputs: Purchase successful. Amount deducted: 150.0. Remaining balance: 450.0

        // Attempt to make a purchase with insufficient balance
        customer.makePurchase(1000.00); // Outputs: Insufficient balance or invalid amount.
    }
}

