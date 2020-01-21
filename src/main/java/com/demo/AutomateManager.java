package com.demo;

public class AutomateManager {
    private Automate automate;

    public AutomateManager(Automate automate) {
        this.automate = automate;
    }

    public void listAvailableDrinks(Automate a){
       List drinksList = a.getAvailableDrinks();
    }
}
