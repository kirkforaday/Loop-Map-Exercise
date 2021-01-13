package com.company;

import java.util.Scanner;

import static com.company.CarDealer.carDealer;
import static com.company.StoreNumbers.storeNumbers;

public class Main {

    public static void main(String[] args) {
        Scanner decisionScanner = new Scanner(System.in);
        System.out.println("Would You Like To Work With Numbers or Cars? \n Enter 1 For Numbers. \n Enter 2 For Cars.");
        String decision = decisionScanner.next();
        if (decision.equals("1")) {
            storeNumbers();
        } else if (decision.equals("2"))
        {
            carDealer();
        } else {
            System.out.print("You Did Not Enter A Valid Selection. Goodbye.");
        }
    }
}
