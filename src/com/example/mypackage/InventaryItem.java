package com.example.mypackage;

public class InventaryItem {

    private String name;
    private int quantity;
    private String category;
    private double price;
    final private int id;

    public InventaryItem(String name, int quantity, String category, double price, int id) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

}
