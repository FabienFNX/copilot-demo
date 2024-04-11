package com.copilot.demo.models;

import java.util.concurrent.atomic.AtomicInteger;

public class PurchaseRecord {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String product;
    private int quantity;
    private double price;
    private String date;

    public PurchaseRecord(String product, int quantity, double price, String date) {
        this.id = count.incrementAndGet();
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    // Setters
    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }
}