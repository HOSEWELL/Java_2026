package com.github.hosewell.assignment.assessment3_hosewell.problem1;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publicationDate;

    public Magazine(String itemId, String title, String author, int issueNumber, String publicationDate) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    public void checkout() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Magazine '" + getTitle() + "' (Issue #" + issueNumber + ") checked out. Please handle with care.");
        } else {
            System.out.println("This magazine is already in use.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" | Issue: " + issueNumber + " | Date: " + publicationDate);
    }
}