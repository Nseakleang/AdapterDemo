package com.seakleang.adapterdemo.Entity;

public class Product {

    private int id;
    private String price;
    private String image;

    public Product() {
    }

    public Product(String price, String image) {
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
