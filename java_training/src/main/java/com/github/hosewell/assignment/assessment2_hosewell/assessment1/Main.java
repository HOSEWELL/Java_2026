package com.github.hosewell.assignment.assessment2_hosewell.assessment1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java All The Way", "Hosewell", "9780123456789", 45.50);
        
        System.out.println(book.toString());
        
        book.borrowBook();
        book.borrowBook();
        book.returnBook();
        
        Book invalidBook = new Book("", "", "123", -5.0);
        System.out.println(invalidBook.toString());
    }
}