package com.demo;

/**
 * @author : john.ladeveze
 */

public enum Boissons {
    COCA_COLA("Coca Cola", "1.50"),
    FANTA("Fanta", "1.50"),
    SPRIT("Sprite", "1.50"),
    ICE_TEA("Ice Tea", "1.50"),
    RED_BULL("Red Bull", "2.00"),
    EVIAN("Evian", "1.00");

    private String price;
    private String name;

    Boissons(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public String toString() {
        return price + name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
