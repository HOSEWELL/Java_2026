package com.github.hosewell.assignment.javase010.assessment1;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, double price) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPrice(price);
        this.isAvailable = true; 
    }

    public String getTitle() { return title; }
    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Error: Title cannot be empty.");
        }
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Error: Author cannot be empty.");
        }
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) {
        if (isbn != null && isbn.matches("\\d{13}")) {
            this.isbn = isbn;
        } else {
            System.out.println("Error: ISBN must be exactly 13 digits.");
        }
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    public boolean isAvailable() { return isAvailable; }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println("Unavailable: " + title);
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Returned: " + title);
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", price=" + price + ", isAvailable=" + isAvailable + "]";
    }
}