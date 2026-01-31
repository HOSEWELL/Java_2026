package com.github.hosewell.assignment.assessment3_hosewell.problem1;

public class DVD extends LibraryItem {
    private int duration;
    private String rating;

    public DVD(String itemId, String title, String author, int duration, String rating) {
        super(itemId, title, author);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public void checkout() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("DVD '" + getTitle() + "' checked out. Return in 7 days.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(" | Duration: " + duration + " mins | Rating: " + rating);
    }
}
