/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

/**
 *
 * @author kha.bachiren
 */
public class Boisson implements I_Payant {
   private double prix;
   
   public  Boisson(double prix){
    this.prix = prix;
}

    public double getPrix(){
        return this.prix;
    }
}
