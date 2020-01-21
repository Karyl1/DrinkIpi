/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.util.*;
/**
 *
 * @author kha.bachiren
 */
public class Principale {
    public static void main(String[] args){
        /*Boisson b1=new Boisson(10.2);
        Boisson b2=new Boisson(10.58);
        Boisson b3=new Boisson(9.2);
        Service s1=new Service(50);
        Service s2=new Service(42.5);
        Service s3=new Service(39.54);
        ArrayList<I_Payant>ligne_prix = new ArrayList<I_Payant>();
        ligne_prix.add(b1);ligne_prix.add(b2);ligne_prix.add(s1);
        ligne_prix.add(b3);ligne_prix.add(s3);ligne_prix.add(s2);
        double total=0;
        for (I_Payant val:ligne_prix ){

            total+=val.getPrix();
        }
        System.out.println("total des lignes service compris :" + total);
        System.out.println(b1.getClass().getSimpleName());*/

        int counter = 0;
        System.out.println("Avez-vous de la monnaie ? [o/n]");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.equals("n") || str.equals("N")) {
            System.out.println("Merci de votre visite. A bientôt !");
            System.exit(1);
        }
//        }else if (str.equals("o") || str.equals("O")){
        System.out.println("Veuillez insérer votre monnaie :\n" +
                "La machine n'accepte que les pièces de 2€ mais rend la monnaie");
        String str2 = sc.nextLine();
        if(str2.equals("2")){
            System.out.println("Veuillez choisir votre boisson :\n");

            for (Boissons mark : Boissons.values()){
                counter++;
                System.out.println(mark.getName() + "\t" + mark.getPrice() + "\t" + counter);
            }
        }
        /*}else{
            System.out.println("Je n'ai pas compris votre réponse. A bientôt !");
            System.exit(1);
        }*/


    }

}