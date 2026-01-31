package com.github.hosewell.assignment.assessment3_hosewell.problem3;

public class Clothing extends Product {
    private String size;

    public Clothing(String id, String name, double price, int stock, String size) throws InvalidProductException {
        super(id, name, price, stock);
        this.size = size;
    }

    @Override
    public double calculateDiscount() { return price * 0.25; } 

    @Override
    public String getProductType() { return "Clothing"; }
}