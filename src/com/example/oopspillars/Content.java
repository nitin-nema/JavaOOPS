package com.example.oopspillars;

// Base class representing general content in a CMS
class Content {
    // Protected attributes, accessible by subclasses
    protected String contentId;
    protected String title;
    protected String author;
    protected String publicationDate;

    // Constructor to initialize content details
    public Content(String contentId, String title, String author, String publicationDate) {
        this.contentId = contentId;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    // Method to display general content details
    public void displayDetails() {
        System.out.println("Content ID: " + contentId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Date: " + publicationDate);
    }
}

// Derived class representing an Article
class Article extends Content {
    // Unique attribute for Article
    private int wordCount;

    // Constructor to initialize Article details
    public Article(String contentId, String title, String author, String publicationDate, int wordCount) {
        super(contentId, title, author, publicationDate);
        this.wordCount = wordCount;
    }

    // Method to display Article details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Word Count: " + wordCount);
    }
}

// Derived class representing a Video
class Video extends Content {
    // Unique attribute for Video
    private double duration; // Duration in minutes

    // Constructor to initialize Video details
    public Video(String contentId, String title, String author, String publicationDate, double duration) {
        super(contentId, title, author, publicationDate);
        this.duration = duration;
    }

    // Method to display Video details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " minutes");
    }
}

// Derived class representing a Podcast
class Podcast extends Content {
    // Unique attribute for Podcast
    private String guestSpeaker;

    // Constructor to initialize Podcast details
    public Podcast(String contentId, String title, String author, String publicationDate, String guestSpeaker) {
        super(contentId, title, author, publicationDate);
        this.guestSpeaker = guestSpeaker;
    }

    // Method to display Podcast details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Guest Speaker: " + guestSpeaker);
    }
}
