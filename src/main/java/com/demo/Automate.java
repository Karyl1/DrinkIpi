package com.demo;

public class Automate {

    private List <Boissons> availableDrinks;
    private double availableMoney;

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

    public void setAvailableDrinks(List<Boissons> availableDrinks) {
        this.availableDrinks = availableDrinks;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }




}
