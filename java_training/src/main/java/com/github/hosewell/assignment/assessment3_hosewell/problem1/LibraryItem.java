package com.github.hosewell.assignment.assessment3_hosewell.problem1;

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public abstract void checkout();
    
    public void returnItem() {
        this.isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public void displayDetails() {
        System.out.print("ID: " + itemId + " | Title: " + title + " | Author: " + author);
    }
}