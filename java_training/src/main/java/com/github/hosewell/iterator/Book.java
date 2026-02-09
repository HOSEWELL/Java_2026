package com.github.hosewell.iterator;

public class Book {
    private String authorName;
    private String isbn;
    private String year;


    public Book (String authorName, String isbn, String year){

        this.authorName = authorName;
        this.isbn = isbn;
        this.year = year;

    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorName() {
        return authorName;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }


}
