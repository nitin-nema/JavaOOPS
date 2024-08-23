package com.example.oopspillars;

// Base class representing a generic notification
class Notification {
    public void sendNotification(String message) {
        System.out.println("Sending notification: " + message);
    }
}

// Subclass for email notifications
class EmailNotification extends Notification {
    private String emailAddress;

    public EmailNotification(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email to " + emailAddress + ": " + message);
    }
}

// Subclass for SMS notifications
class SMSNotification extends Notification {
    private String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}

// Subclass for push notifications
class PushNotification extends Notification {
    private String deviceId;

    public PushNotification(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification to device " + deviceId + ": " + message);
    }
}

// Main class to demonstrate polymorphism
public class NotificationDemo {
    public static void main(String[] args) {
        Notification email = new EmailNotification("user@example.com");
        Notification sms = new SMSNotification("123-456-7890");
        Notification push = new PushNotification("device123");

        email.sendNotification("Welcome to our service!");
        sms.sendNotification("Your OTP is 987654.");
        push.sendNotification("You have a new message.");
    }
}
