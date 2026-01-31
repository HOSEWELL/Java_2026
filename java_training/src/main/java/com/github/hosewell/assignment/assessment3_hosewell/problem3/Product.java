package com.github.hosewell.assignment.assessment3_hosewell.problem3;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity) throws InvalidProductException {
        if (price < 0 || stockQuantity < 0) {
            throw new InvalidProductException("Price and Stock cannot be negative.");
        }
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public abstract double calculateDiscount();
    public abstract String getProductType();

    public void reduceStock(int quantity) throws OutOfStockException { 
    if (quantity > stockQuantity) {
        throw new OutOfStockException("Not enough stock!");
    }
    this.stockQuantity -= quantity;
}

    public void displayProductInfo() {
        System.out.println("[" + getProductType() + "] ID: " + productId + " | Name: " + name + " | Price: $" + price + " | Stock: " + stockQuantity);
    }
}