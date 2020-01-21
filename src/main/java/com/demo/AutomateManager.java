package com.demo;

import java.util.List;
import java.util.stream.Stream;

public class AutomateManager {
    private Automate automate;

    public AutomateManager(Automate automate) {
        this.automate = automate;
    }

    public void listAvailableDrinks(Automate a){
       List<Boissons> drinksList = a.getAvailableDrinks();
       Stream <Boissons> sb = drinksList.stream();
       sb.forEach(System.out::println);
    }

    public void initMessage(Automate a){
        a.setMessage("insérez money");
    }

    public void thanksMessage(Automate a){

    }

    public void chooseDrinkMessage(Automate a){
        a.setMessage("choisissez votre boisson");
    }
}
