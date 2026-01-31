package com.github.hosewell.assignment.assessment3_hosewell.problem3;

public class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(String id, String name, double price, int stock, int warranty) throws InvalidProductException {
        super(id, name, price, stock);
        this.warrantyPeriod = warranty;
    }

    @Override
    public double calculateDiscount() { return price * 0.15; } 

    @Override
    public String getProductType() { return "Electronics"; }
}