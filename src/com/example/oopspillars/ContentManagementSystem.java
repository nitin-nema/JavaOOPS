package com.example.oopspillars;

// Main class to demonstrate inheritance in a CMS
public class ContentManagementSystem {
    public static void main(String[] args) {
        // Create an Article object
        Content myArticle = new Article("A101", "Understanding Inheritance", "Alice Smith", "2024-08-22", 1200);
        System.out.println("Article Details:");
        myArticle.displayDetails();

        // Create a Video object
        Content myVideo = new Video("V202", "Inheritance in Java", "Bob Johnson", "2024-08-20", 15.5);
        System.out.println("\nVideo Details:");
        myVideo.displayDetails();

        // Create a Podcast object
        Content myPodcast = new Podcast("P303", "The Power of OOP", "Carol White", "2024-08-21", "David Brown");
        System.out.println("\nPodcast Details:");
        myPodcast.displayDetails();
    }
}
