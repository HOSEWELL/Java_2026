package com.github.hosewell.assignment.assessment3_hosewell.problem1;

public class Book extends LibraryItem {
    private String isbn;
    private String genre;

    public Book(String itemId, String title, String author, String isbn, String genre) {
        super(itemId, title, author);
        this.isbn = isbn;
        this.genre = genre;
    }

    @Override
    public void checkout() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Book '" + getTitle() + "' checked out. Enjoy your reading!");
        } else {
            System.out.println("This book is currently unavailable.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" | ISBN: " + isbn + " | Genre: " + genre);
    }
}
