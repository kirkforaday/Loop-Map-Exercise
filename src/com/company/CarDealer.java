package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class CarDealer {
    public static void carDealer() {
        //Create Scanner
        Scanner carFinder = new Scanner(System.in);
        //Create HashMap Object
        HashMap<String, String> inventory = new HashMap<>();
        //Add Inventory
        inventory.put("Civic", "Honda");
        inventory.put("Xterra", "Nissan");
        inventory.put("Camry", "Toyota");
        inventory.put("Ram", "Dodge");
        inventory.put("Equinox", "Chevrolet");
        inventory.put("Silverado", "Chevrolet");
        inventory.put("Sierra", "GMC");
        inventory.put("Rav4", "Toyota");
        inventory.put("Accord", "Honda");
        inventory.put("Rogue", "Nissan");
        inventory.put("Explorer", "Ford");
        inventory.put("Escape", "Ford");
        inventory.put("Wrangler", "Jeep");
        inventory.put("Cherokee", "Jeep");
        inventory.put("Altima", "Nissan");
        inventory.put("Malibu", "Chevrolet");
        inventory.put("Soul", "Kia");
        inventory.put("Fusion", "Ford");
        inventory.put("Titan", "Nissan");
        inventory.put("Tacoma", "Toyota");
        inventory.put("Model S", "Tesla");
        //Ask Customer What They Are Looking For
        System.out.println("What Model Car Are You Looking For Today?");
        String carModel = carFinder.next();
        //Search Inventory For User's Request
        String output = inventory.get(carModel);
        if (output == null) {
            System.out.println("We currently do not have that model in stock.");
        } else {
            System.out.println("Oh you're looking for a " + carModel +  "? " + "Our " + output + " selection is right over here.");
        }
        }


    }

