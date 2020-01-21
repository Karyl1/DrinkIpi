package com.demo;

import java.util.List;
import java.util.stream.Stream;

public class AutomateManager {
    private Automate automate;

    public AutomateManager(Automate automate) {
        this.automate = automate;
    }

    public void listAvailableDrinks() {
        List<Boissons> drinksList = automate.getAvailableDrinks();
        Stream<Boissons> sb = drinksList.stream();
        sb.forEach(System.out::println);
    }

    public void initMessage() {
        automate.setMessage("insérez money");
    }

    public void pickUpMessage() {
        automate.setMessage("Vous pouvez récupérer votre boisson ");
    }

    public void chooseDrinkMessage() {
        automate.setMessage("choisissez votre boisson");
    }

    /*public double giveBackMoney(double insertedCoins) {
        double returnedMoney= insertedCoins - ;
        automate.setAvailableMoney(insertedCoins);
        return
    }*/

    public void pickUpMoneyMessage() {
        automate.setMessage("Vous pouvez récupérer votre monnaie ");
    }

}
