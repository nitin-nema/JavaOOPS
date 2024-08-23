package com.example.oopspillars;

// Abstract class representing a general authenticator
abstract class Authenticator {
    abstract boolean authenticate(String username, String password); // Abstract method
}

// Concrete class for database authentication
class DatabaseAuthenticator extends Authenticator {
    @Override
    boolean authenticate(String username, String password) {
        // Imagine this method connects to a database and checks the credentials
        System.out.println("Authenticating user " + username + " via database.");
        return username.equals("admin") && password.equals("password123");
    }
}

// Concrete class for OAuth authentication
class OAuthAuthenticator extends Authenticator {
    @Override
    boolean authenticate(String username, String password) {
        // Imagine this method connects to an OAuth provider and checks the credentials
        System.out.println("Authenticating user " + username + " via OAuth.");
        return username.equals("user1") && password.equals("oauthPass");
    }
}

// Main class to demonstrate data abstraction
public class AuthenticatorDemo {
    public static void main(String[] args) {
        Authenticator auth = new DatabaseAuthenticator();
        boolean isAuthenticated = auth.authenticate("admin", "password123");

        System.out.println("Authentication successful: " + isAuthenticated);
    }
}
