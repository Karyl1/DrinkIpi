package com.demo;

/**
 * Autor : John LADEVEZE
 */

public enum Boissons {
    COCA_COLA("1.50"),
    FANTA("1.50"),
    SPRIT("1.50"),
    ICE_TEA("1.50"),
    RED_BULL("2.00"),
    EVIAN("1.00");

    private String price;

    Boissons(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public String toString() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
