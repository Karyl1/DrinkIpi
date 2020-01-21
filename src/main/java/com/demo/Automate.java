package com.demo;

import java.util.List;

public class Automate {

    private List <Boissons> availableDrinks;
    private double availableMoney;
    private String message;

    public Automate(List<Boissons> availableDrinks, double availableMoney) {
        this.availableDrinks = availableDrinks;
        this.availableMoney = availableMoney;
    }

    public List<Boissons> getAvailableDrinks() {
        return availableDrinks;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public String getMessage() {
        return message;
    }



    public void setAvailableDrinks(List<Boissons> availableDrinks) {
        this.availableDrinks = availableDrinks;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
